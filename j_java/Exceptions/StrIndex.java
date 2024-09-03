// Q17: Write a program to generate StringIndexOutOfBoundsException

public class StrIndex {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = str.charAt(10);
        System.out.println("Character at index 10: " + ch);
    }
}
