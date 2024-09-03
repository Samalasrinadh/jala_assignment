// Q1: Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadTxt {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("example.txt")) {
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
