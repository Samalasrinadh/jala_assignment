// Q9: Write a program to read data from properties file

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropRead {
    public static void main(String[] args) {
        Properties props = new Properties();
        try (InputStream is = new FileInputStream("config.properties")) {
            props.load(is);
            System.out.println("Property value: " + props.getProperty("key"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
