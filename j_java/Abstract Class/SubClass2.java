// Q4: Create an instance for the child class in child class and call non-abstract methods

class SubClassCallNonAbs extends AbsClass {
    @Override
    void absMethod() {
        System.out.println("Implemented abstract method in SubClassCallNonAbs.");
    }
    public static void main(String[] args) {
        SubClassCallNonAbs obj = new SubClassCallNonAbs();
        obj.nonAbsMethod();
    }
}
