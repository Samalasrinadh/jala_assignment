// Q1: Print the fields/instance members of the current class using this and without using object

class CurrClass {
    int num = 42;
    String text = "Current Class";

    void display() {
        System.out.println("Number: " + this.num);
        System.out.println("Text: " + this.text);
    }

    public static void main(String[] args) {
        CurrClass obj = new CurrClass();
        obj.display();
    }
}
