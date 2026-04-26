package fileIO;
import java.io.*;

public class buffer_wr {
    public static void bufferedReaderExample() {
        try (FileReader fr = new FileReader("src/fileIO/input.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void bufferedWriterExample() {
        try (FileWriter fw = new FileWriter("src/fileIO/output.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Ví dụ ghi bằng BufferedWriter");
            bw.newLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        bufferedReaderExample();
        bufferedWriterExample();
    }

}


// buffer là bộ nhớ đệm, có thể coi là trung gian khi mà viết dữ liệu lên ổ cứng — với buffer, dữ liệu được ghi vào vùng đệm trước
// và được flush ra ổ đĩa theo từng đợt; điều này tiết kiệm I/O và tăng hiệu suất.