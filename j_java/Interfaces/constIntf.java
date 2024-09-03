// Q11: Create an interface with a static final variable

interface ConstIntf {
    static final int CONST_VAL = 100;

    void printValue();
}

class ImplConst implements ConstIntf {
    @Override
    public void printValue() {
        System.out.println("Constant value: " + CONST_VAL);
    }

    public static void main(String[] args) {
        ImplConst obj = new ImplConst();
        obj.printValue();
    }
}
