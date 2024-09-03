// Q4: Write text to a .txt file using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BuffWrite {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("example.txt"))) {
            String text = "Hello, Buffered World!";
            bos.write(text.getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
