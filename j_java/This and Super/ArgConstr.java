// Q4: Call argument constructor of current class using this()

class ArgConstr {
    int num;
    String text;
    ArgConstr() {
        this(42, "Argument Constructor");  
    ArgConstr(int num, String text) {
        this.num = num;
        this.text = text;
        System.out.println("Argument Constructor called: " + num + ", " + text);
    }

    public static void main(String[] args) {
        ArgConstr obj = new ArgConstr();
    }
}
