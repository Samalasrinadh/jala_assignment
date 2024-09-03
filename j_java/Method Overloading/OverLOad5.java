// Q5: Write two methods with the same name, number of parameters, and data type but different return type

class Overload5 {

    int calculate(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Overload5 obj = new Overload5();
        int result = obj.calculate(10, 20);  
        System.out.println("Result: " + result);
    }
}
