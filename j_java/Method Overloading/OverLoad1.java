// Q1: Write two methods with the same name but different number of parameters of the same type

class Overload1 {
    void display(int a) {
        System.out.println("Display method with one parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Display method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Overload1 obj = new Overload1();
        obj.display(10);       
        obj.display(20, 30);    
    }
}
