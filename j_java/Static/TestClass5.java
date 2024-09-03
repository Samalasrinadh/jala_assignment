// 5. Call static methods in instance methods
class TestClass{
    static int statVar1=10;
    static int statVar2=20;
    
    int instVar1=30;
    int instVar2=40;
    
    void instMethod1(){
        statMethod1(); // Directly call static method
    }
    
    static void statMethod1(){
        System.out.println("Static Method 1");
    }
    
    public static void main(String[] args){
        TestClass obj=new TestClass();
        obj.instMethod1();
    }
}
