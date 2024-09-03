// Q7: Read text from a .txt file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffRead2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
