// Q1: Class with private fields and methods, access them in main method and subclass

class PriClass {
    private int num = 10;
    private String text = "Hello";

    private void show() {
        System.out.println("Private Method: num = " + num + ", text = " + text);
    }
    public static void main(String[] args) {
        PriClass obj = new PriClass();
        System.out.println("Private num: " + obj.num);
        System.out.println("Private text: " + obj.text);
        obj.show();
    }
}

class SubClass extends PriClass {
    public void access() {
    
    }
}
