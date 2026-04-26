package fileIO;
import java.io.*;

public class knowledge {
    public static void learn_reader() {
        try (FileReader ab = new FileReader("src/fileIO/input.txt")) {
            int content;
            while ((content = ab.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void learn_writer(){
        try(FileWriter bc = new FileWriter("src/fileIO/input.txt")){
            bc.write("Tiendung vodich dep trai \n");
            bc.write("mong dc 20 final java \n");
        } catch(Exception e){
            System.out.println(e);
        }
    }

    // PrintWriter cũng y hệt như thế nha, chỉ các là nó cho phép dùng print để ghi vào file txt
    public static void learn_printWriter(){
        try(PrintWriter df = new PrintWriter("src/fileIO/printWriter.txt")){
            df.println("Tiendung vodich dep trai \n");
            df.printf("mong dc %d final java \n",20);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        learn_reader();
        learn_writer();
        learn_printWriter();
    }
}
