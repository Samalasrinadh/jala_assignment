// Q6: Create an interface with a default method, implement it in a class, and call the default method

interface DefMeth {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}

class ImplDef implements DefMeth {
    // No need to override the default method

    public static void main(String[] args) {
        ImplDef obj = new ImplDef();
        obj.defaultMethod();
    }
}
