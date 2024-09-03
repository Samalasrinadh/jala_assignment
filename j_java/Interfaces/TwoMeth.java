// Q2: Create an interface with two methods, implement only one in a class

interface TwoMeth {
    void display();
    void print();
}

class ImplTwo implements TwoMeth {
    @Override
    public void display() {
        System.out.println("Display method implemented.");
    }

    // print() method is not implemented
    public static void main(String[] args) {
        ImplTwo obj = new ImplTwo();
        obj.display();
    }
}
