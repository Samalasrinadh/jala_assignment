// 2. Program to demonstrate increment (++) and decrement (--) operators

class Incdec {
    void incrementDecrement(int num) {
        System.out.println("Original number: " + num);
        System.out.println("After increment: " + (++num));
        System.out.println("After decrement: " + (--num));
    }

    public static void main(String[] args) {
        Incdec obj = new Incdec();
        obj.incrementDecrement(5); 
    }
}
