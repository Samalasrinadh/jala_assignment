// 6. Program to print even numbers between 10 and 100 using while loop

class EvenNumbers {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
