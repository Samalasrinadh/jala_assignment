// Q5: Write a program to read text from .txt file using FileReader

import java.io.FileReader;
import java.io.Reader;

public class FileRead {
    public static void main(String[] args) {
        try (Reader fr = new FileReader("example.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
