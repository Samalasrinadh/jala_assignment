// Q2: Call the constructors (both default and argument constructors) of superclass from a child class

class Parent {
    Parent() {
        System.out.println("Parent Default Constructor called.");
    }
    Parent(int a) {
        System.out.println("Parent One Argument Constructor called with value: " + a);
    }
}

class Child extends Parent {
    Child() {
        super(); 
        System.out.println("Child Default Constructor called.");
    }
    Child(int a) {
        super(a);  
        System.out.println("Child One Argument Constructor called with value: " + a);
    }

    public static void main(String[] args) {
        Child obj1 = new Child();      
        Child obj2 = new Child(100);   
    }
}
