// 5. Program to print largest number among three numbers

class LargestNum {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 20;
        if (a >= b && a >= c) {
            System.out.println("Largest number: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}
