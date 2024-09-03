// 5. Program to demonstrate local and global variables with the same name

class Variable {
    // Global variable
    int var = 10;

    void displayVar() {
        // Local variable
        int var = 20;
        System.out.println("Local variable: " + var); // Prints local variable
        System.out.println("Global variable: " + this.var); // Prints global variable using 'this' keyword
    }

    public static void main(String[] args) {
        Variable obj = new Variable();
        obj.displayVar();
    }
}
