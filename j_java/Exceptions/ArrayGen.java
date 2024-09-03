// Q9: Write a program to generate ArrayIndexOutOfBoundsException

public class ArrayGen {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[10] = 100;
        System.out.println("Value at index 10: " + arr[10]);
    }
}
