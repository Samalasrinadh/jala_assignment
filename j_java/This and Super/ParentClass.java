// Q2: Print the fields/instance members of the parent class using super

class ParentClass {
    int num = 50;
    String text = "Parent Class";
}

class ChildClass extends ParentClass {
    int num = 25;  

    void show() {
        System.out.println("Child Number: " + this.num);
        System.out.println("Parent Number: " + super.num);
        System.out.println("Parent Text: " + super.text);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}
