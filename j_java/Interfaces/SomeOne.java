// Q5: Create two interfaces with the same method (same signature) and implement them in one class

interface SameOne {
    void common();
}

interface SameTwo {
    void common();
}

class ImplSame implements SameOne, SameTwo {
    @Override
    public void common() {
        System.out.println("Same method from two interfaces implemented.");
    }

    public static void main(String[] args) {
        ImplSame obj = new ImplSame();
        obj.common();
    }
}
