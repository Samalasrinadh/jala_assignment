// Q3: Create an instance for the child class in child class and call abstract methods

class SubClassCallAbs extends AbsClass {
    @Override
    void absMethod() {
        System.out.println("Implemented abstract method in SubClassCallAbs.");
    }
    public static void main(String[] args) {
        SubClassCallAbs obj = new SubClassCallAbs();
        obj.absMethod();
    }
}
