// Q11: Write a program to generate FileNotFoundException

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileGen {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
