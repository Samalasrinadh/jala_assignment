// 3. Program to demonstrate equal (==) and not equal (!=) operators
class EqualityOperators {
    void checkEquality(int a, int b) {
        System.out.println("Is " + a + " equal to " + b + "? " + (a == b));
        System.out.println("Is " + a + " not equal to " + b + "? " + (a != b));
    }

    public static void main(String[] args) {
        EqualityOperators obj = new EqualityOperators();
        obj.checkEquality(10, 20); 
    }
}
