// 1. Class with 2 static variables, 2 instance variables, 2 static methods, 2 instance methods, and a main method
class TestClass{
    // Static variables
    static int statVar1=10;
    static int statVar2=20;
    
    // Instance variables
    int instVar1=30;
    int instVar2=40;
    
    // Static methods
    static void statMethod1(){
        System.out.println("Static Method 1");
    }
    
    static void statMethod2(){
        System.out.println("Static Method 2");
    }
    
    // Instance methods
    void instMethod1(){
        System.out.println("Instance Method 1");
    }
    
    void instMethod2(){
        System.out.println("Instance Method 2");
    }
    
    // Main method
    public static void main(String[] args){
        // 6. Print all the static, instance variables in main method
        System.out.println("Static Variable 1: "+statVar1);
        System.out.println("Static Variable 2: "+statVar2);
        
        // Creating an instance to access instance variables and methods
        TestClass obj=new TestClass();
        
        System.out.println("Instance Variable 1: "+obj.instVar1);
        System.out.println("Instance Variable 2: "+obj.instVar2);
        
        // 7. Call static methods and instance methods in main method
        statMethod1();
        statMethod2();
        
        obj.instMethod1();
        obj.instMethod2();
    }
}
