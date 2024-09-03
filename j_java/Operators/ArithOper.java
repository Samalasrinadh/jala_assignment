// 1. Program to demonstrate arithmetic operators (+, -, *, /)
class ArithOper {
    void per(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        ArithOper obj = new ArithOper();
        obj.per(20, 10); 
}
}
