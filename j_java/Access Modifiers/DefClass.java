// Q2: Class with default fields and methods, access them in same package
class DefClass {
    // Default fields
    int num = 20;
    String text = "World";
    void display() {
        System.out.println("Default Method: num = " + num + ", text = " + text);
    }
}
class AnotherClass {
    public static void main(String[] args) {
        DefClass obj = new DefClass();
        System.out.println("Default num: " + obj.num);
        System.out.println("Default text: " + obj.text);
        obj.display();
    }
}
