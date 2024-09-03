// Q2: Create a subclass for the abstract class and access non-abstract methods

class SubClass extends AbsClass {
    // Implementing the abstract method
    @Override
    void absMethod() {
        System.out.println("Implemented abstract method.");
    }

    // Main method to create an object
    public static void main(String[] args) {
        AbsClass obj = new SubClass();
        // Access non-abstract method
        obj.nonAbsMethod();
    }
}
