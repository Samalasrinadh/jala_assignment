// Q3: Use Interface instances to call the implemented method in the implemented class

class ImplInst implements OneMeth {
    @Override
    public void show() {
        System.out.println("OneMeth Interface method called using interface instance.");
    }

    public static void main(String[] args) {
        OneMeth obj = new ImplInst();
        obj.show();
    }
}
