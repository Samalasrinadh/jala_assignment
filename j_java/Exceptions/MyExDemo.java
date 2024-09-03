// Q6: Write a program to create your own exception

class MyEx extends Exception {
    public MyEx(String message) {
        super(message);
    }
}

public class MyExDemo {
    public static void main(String[] args) {
        try {
            throw new MyEx("This is a custom exception.");
        } catch (MyEx e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
