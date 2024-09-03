// Q3: Read text from a .txt file using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BuffRead {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
