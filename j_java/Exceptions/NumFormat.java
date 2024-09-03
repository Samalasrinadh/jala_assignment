// Q16: Write a program to generate NumberFormatException

public class NumFormat {
    public static void main(String[] args) {
        String str = "abc";
        int num = Integer.parseInt(str);
        System.out.println("Number: " + num);
    }
}
