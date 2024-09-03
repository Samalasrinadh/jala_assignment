// Q3: Write two methods with the same name and same number of parameters of the same type
class Overload3 {
    void compute(int a, int b) {
        System.out.println("Compute method with two int parameters: " + (a + b));
    }

    public static void main(String[] args) {
        Overload3 obj = new Overload3();
        obj.compute(10, 20);   
    }
}
