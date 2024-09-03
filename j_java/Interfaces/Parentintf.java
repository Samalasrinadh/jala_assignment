// Q7: Create an interface and inherit it from another interface

interface ParentIntf {
    void parentMethod();
}

interface ChildIntf extends ParentIntf {
    void childMethod();
}

class ImplInher implements ChildIntf {
    @Override
    public void parentMethod() {
        System.out.println("Parent interface method.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child interface method.");
    }

    public static void main(String[] args) {
        ImplInher obj = new ImplInher();
        obj.parentMethod();
        obj.childMethod();
    }
}
