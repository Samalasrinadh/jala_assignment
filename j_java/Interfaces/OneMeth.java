// Q1: Create an interface with only one method and implement it in a class

interface OneMeth {
    void show();
}
class ImplOne implements OneMeth {
    @Override
    public void show() {
        System.out.println("OneMeth Interface implemented.");
    }
    public static void main(String[] args) {
        ImplOne obj = new ImplOne();
        obj.show();
    }
}
