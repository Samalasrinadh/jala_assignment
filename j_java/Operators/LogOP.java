// 5. Program to demonstrate logical AND (&&), OR (||), and NOT (!) operators
class LogOp {
    void logical(boolean a, boolean b) {
        System.out.println("Logical AND (a && b): " + (a && b));
        System.out.println("Logical OR (a || b): " + (a || b));
        System.out.println("Logical NOT (!a): " + (!a));
    }

    public static void main(String[] args) {
        LogOp obj = new LogOp();
        obj.logical(true, false); // Replace true and false with any boolean values
    }
}
