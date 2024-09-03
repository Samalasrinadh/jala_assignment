// 7. Call static methods and instance methods in main method
class TestClass{
    static int statVar1=10;
    static int statVar2=20;
    
    int instVar1=30;
    int instVar2=40;
    
    static void statMethod1(){
        System.out.println("Static Method 1");
    }
    
    void instMethod1(){
        System.out.println("Instance Method 1");
    }
    
    public static void main(String[] args){
        // Calling static methods
        statMethod1();
        
        // Creating an instance to call instance methods
        TestClass obj=new TestClass();
        obj.instMethod1();
    }
}
