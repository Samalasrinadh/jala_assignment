// Q5: Call constructor of the parent class using super()

class ParentConstr {
    ParentConstr() {
        System.out.println("Parent Constructor called.");
    }

    ParentConstr(int x) {
        System.out.println("Parent Constructor with argument: " + x);
    }
}

class ChildConstr extends ParentConstr {
    ChildConstr() {
        super(10);  
        System.out.println("Child Constructor called.");
    }

    public static void main(String[] args) {
        ChildConstr obj = new ChildConstr();
    }
}
