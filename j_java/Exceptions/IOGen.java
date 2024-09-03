// Q12: Write a program to generate IOException

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOGen {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try (FileInputStream fis = new FileInputStream(file)) {
            // Code that may cause IOException
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
