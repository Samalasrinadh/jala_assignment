// Q6: Use this() and super() in methods not in constructors

class SuperClass {
    void display() {
        System.out.println("Method in SuperClass.");
    }
}

class SubClass extends SuperClass {
    void display() {
        System.out.println("Method in SubClass.");
    }

    void callMethods() {
        this.display();   
        super.display();  
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.callMethods();
    }
}
