// Q4: Write two methods with the same name and same number of parameters of different data types

class Overload4 {
    void process(int a) {
        System.out.println("Process method with int parameter: " + a);
    }

    void process(double a) {
        System.out.println("Process method with double parameter: " + a);
    }

    public static void main(String[] args) {
        Overload4 obj = new Overload4();
        obj.process(100);     
        obj.process(10.5);     
    }
}
