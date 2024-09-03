// Q2: Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteTxt {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("example.txt")) {
            String text = "Hello, World!";
            os.write(text.getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
