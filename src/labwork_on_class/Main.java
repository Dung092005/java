import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner đọc từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập một số nguyên
        System.out.print("Nhập số nguyên: ");
        int n = sc.nextInt();

        // Nhập một số thực
        System.out.print("Nhập số thực: ");
        double x = sc.nextDouble();

        // Nhập một chuỗi (1 từ, không có khoảng trắng)
        System.out.print("Nhập một từ: ");
        String word = sc.next();

        // Nhập cả một dòng (có thể chứa khoảng trắng)
        sc.nextLine(); // bỏ dòng thừa trước khi đọc full line
        System.out.print("Nhập một câu: ");
        String line = sc.nextLine();

        // In ra để kiểm tra
        System.out.println("Số nguyên: " + n);
        System.out.println("Số thực: " + x);
        System.out.println("Từ: " + word);
        System.out.println("Câu: " + line);

        // Đóng Scanner
        sc.close();
    }
}
