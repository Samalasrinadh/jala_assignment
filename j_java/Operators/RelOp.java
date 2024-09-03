// 6. Program to demonstrate relational operators (<, <=, >, >=)

class RelOp {
    void com(int a, int b) {
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
    }

    public static void main(String[] args) {
        RelOp obj = new RelOp();
        obj.com(15, 20); 
    }
}
