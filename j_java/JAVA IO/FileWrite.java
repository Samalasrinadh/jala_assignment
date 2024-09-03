// Q6: Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;
import java.io.Writer;

public class FileWrite {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("example.txt")) {
            String text = "Hello, File World!";
            fw.write(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
