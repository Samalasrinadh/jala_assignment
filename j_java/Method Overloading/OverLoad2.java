// Q2: Write two methods with the same name but different number of parameters of different data types

class Overload2 {
    void show(int a) {
        System.out.println("Show method with one int parameter: " + a);
    }
    void show(int a, double b) {
        System.out.println("Show method with one int and one double parameter: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Overload2 obj = new Overload2();
        obj.show(100);          
        obj.show(200, 5.5);      
    }
}
