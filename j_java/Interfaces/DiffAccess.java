// Q10: Interfaces can only have public, static, and final fields in Java. Private and protected fields are not allowed in interfaces.

interface DiffAccess {
    int num = 10; 
    String text = "Interface Field";

    void show();
}

class ImplAccess implements DiffAccess {
    @Override
    public void show() {
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        ImplAccess obj = new ImplAccess();
        obj.show();
    }
}
