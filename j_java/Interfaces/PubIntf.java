// Q8: Create a PUBLIC interface with fields and methods, implement and print the field values

public interface PubIntf {
    int num = 10;
    String text = "Public Interface";

    void display();
}

class ImplPub implements PubIntf {
    @Override
    public void display() {
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        ImplPub obj = new ImplPub();
        obj.display();
    }
}
