package first_revise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private final String id;
    private final String fullName;
    private final String department;
    private final double basicSalary;
    private final double extraSalary;

    public Employee(String id, String fullName, String department, double basicSalary, double extraSalary) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
    }

    public static Employee fromCsv(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid employee line: " + line);
        }
        return new Employee(
                parts[0],
                parts[1],
                parts[2],
                Double.parseDouble(parts[3]),
                Double.parseDouble(parts[4]));
    }

    public String toLine() {
        return String.join(",", id, fullName, department, String.valueOf(basicSalary), String.valueOf(extraSalary));
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDepartment() {
        return department;
    }

    public double income() {
        return basicSalary + extraSalary * 2.5;
    }
}

public class test3 {
    private static final Path OUTPUT = Path.of("src", "first_revise", "output.txt");

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Employee> employees = readEmployees(sc);
            writeEmployees(employees);
            printIncomeReport();
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }

    private static List<Employee> readEmployees(Scanner sc) {
        System.out.print("Enter number of employees: ");
        int total = Integer.parseInt(sc.nextLine().trim());
        List<Employee> employees = new ArrayList<>(total);

        for (int i = 0; i < total; i++) {
            System.out.printf("%nEnter information for employee %d%n", i + 1);
            String id = prompt(sc, "Employee ID");
            String fullName = prompt(sc, "Full name");
            String department = prompt(sc, "Department");
            double basicSalary = promptDouble(sc, "Basic salary");
            double extraSalary = promptDouble(sc, "Extra salary");
            employees.add(new Employee(id, fullName, department, basicSalary, extraSalary));
        }
        return employees;
    }

    private static void writeEmployees(List<Employee> employees) throws IOException {
        List<String> lines = new ArrayList<>(employees.size());
        for (Employee employee : employees) {
            lines.add(employee.toLine());
        }
        Files.write(OUTPUT, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private static void printIncomeReport() throws IOException {
        Files.lines(OUTPUT)
                .map(Employee::fromCsv)
                .forEach(employee -> System.out.printf(
                        "ID: %s | Name: %s | Dept: %s | Income: %.2f%n",
                        employee.getId(),
                        employee.getFullName(),
                        employee.getDepartment(),
                        employee.income()));
    }

    private static String prompt(Scanner sc, String label) {
        System.out.print(label + ": ");
        return sc.nextLine().trim();
    }

    private static double promptDouble(Scanner sc, String label) {
        return Double.parseDouble(prompt(sc, label));
    }
}
