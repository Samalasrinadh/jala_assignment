// Q1: Write a class with a default constructor, one argument constructor, and two argument constructors. 

class MultiConstr {
    MultiConstr() {
        System.out.println("Default Constructor called.");
    }
    MultiConstr(int a) {
        System.out.println("One Argument Constructor called with value: " + a);
    }
    MultiConstr(int a, String b) {
        System.out.println("Two Argument Constructor called with values: " + a + ", " + b);
    }

    public static void main(String[] args) {
        // Instantiating the class to call all constructors
        MultiConstr obj1 = new MultiConstr();        
        MultiConstr obj2 = new MultiConstr(10);      
        MultiConstr obj3 = new MultiConstr(20, "Hello");
    }
}
