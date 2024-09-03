// Q8: Write text to a .txt file using BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffWrite2 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            String text = "Hello, Buffered Writer!";
            bw.write(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
