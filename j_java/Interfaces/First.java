// Q4: Create two interfaces with one method each and implement them in one class

interface First {
    void methodOne();
}

interface Second {
    void methodTwo();
}

class ImplBoth implements First, Second {
    @Override
    public void methodOne() {
        System.out.println("First interface method implemented.");
    }

    @Override
    public void methodTwo() {
        System.out.println("Second interface method implemented.");
    }

    public static void main(String[] args) {
        ImplBoth obj = new ImplBoth();
        obj.methodOne();
        obj.methodTwo();
    }
}
