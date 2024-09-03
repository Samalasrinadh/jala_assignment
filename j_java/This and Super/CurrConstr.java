// Q3: Call constructor of the current class using this()

class CurrConstr {
    int num;
    String text;
    CurrConstr() {
        this(100, "Default Text");  
        System.out.println("No-arg constructor called.");
    }
    CurrConstr(int num, String text) {
        this.num = num;
        this.text = text;
        System.out.println("Parameterized constructor called: " + num + ", " + text);
    }

    public static void main(String[] args) {
        CurrConstr obj = new CurrConstr();
    }
}
