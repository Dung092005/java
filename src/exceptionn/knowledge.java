package exceptionn;

// SimpleExceptionDemo.java
public class knowledge {
    public static void main(String[] args) {
        System.out.println("=== BẮT ĐẦU CHƯƠNG TRÌNH ===\n");

        // 1️⃣ Ví dụ: lỗi chia cho 0
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // gây lỗi
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }

        // 2️⃣ Ví dụ: lỗi truy cập mảng sai chỉ số
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // sai chỉ số
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Truy cập ngoài giới hạn mảng!");
        }

        // 3️⃣ Ví dụ: finally luôn chạy
        try {
            int x = 10 / 2;
            System.out.println("Không có lỗi, kết quả = " + x);
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra!");
        } finally {
            System.out.println("Khối finally luôn được thực thi (dù có lỗi hay không).");
        }

        // 4️⃣ Ví dụ: tự ném lỗi (throw)
        try {
            checkAge(15); // tuổi nhỏ hơn 18 → ném lỗi
        } catch (Exception e) {
            System.out.println("Lỗi kiểm tra tuổi: " + e.getMessage());
        }

        System.out.println("\n=== KẾT THÚC CHƯƠNG TRÌNH ===");
    }

    // 5️⃣ Phương thức kiểm tra tuổi
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Tuổi phải >= 18!");
        } else {
            System.out.println("Tuổi hợp lệ: " + age);
        }
    }
}

