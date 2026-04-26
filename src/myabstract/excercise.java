package myabstract;
abstract class employee{
    private String name;
    private String department;
    public employee(String name,String department){
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    abstract double caluculateSalary();
    void printInfo(){
        System.out.println("name of employee is "+this.name);
        System.out.println("belong to department " + this.department);
    }
}
class Fulltime_employee extends employee{
    private double monthly_salary;
    
    public Fulltime_employee(double monthly_salary, String name, String department){
        super(name, department);
        this.monthly_salary = monthly_salary; 
    }
    
    @Override
    double caluculateSalary() {
        return monthly_salary;
    }
    @Override
    void printInfo(){
        System.out.println("name of employee is "+super.getName());
        System.out.println("belong to department " + super.getDepartment());
        System.out.println("the salary is "+ monthly_salary);
    }
    
}
class parttime_employee extends employee{
    private int hoursWorked;
    private double hourlyRate;
    
    public parttime_employee(String name, String department, int hoursWorked, double hourlyRate) {
        super(name, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    

    @Override
    double caluculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class excercise {
    public static void main(String[] args) {
        Fulltime_employee eploy1 = new Fulltime_employee(8000, "tiendung","fpt");
        parttime_employee eploy2 = new parttime_employee( "thanh","vp bankbank" , 10, 10);
        Fulltime_employee eploy3 = new Fulltime_employee(5000, "daidai", "mb bank");
        
        
         employee [] a = {eploy1,eploy2,eploy3};
         for(employee d : a){
             d.printInfo();
             System.out.println("Salary: " + d.caluculateSalary());
             System.out.println("---");
         }
    }
}
