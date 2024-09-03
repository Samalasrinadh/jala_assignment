// Q4: Write a program with multiple catch blocks

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; 
            int a = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
