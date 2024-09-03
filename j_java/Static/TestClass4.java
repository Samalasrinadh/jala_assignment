// 4. Call instance methods in static methods
class TestClass{
    static int statVar1=10;
    static int statVar2=20;
    
    int instVar1=30;
    int instVar2=40;
    
    static void statMethod1(){
        TestClass obj=new TestClass(); 
        obj.instMethod1();
    }
    
    void instMethod1(){
        System.out.println("Instance Method 1");
    }
    
    public static void main(String[] args){
        statMethod1();
    }
}
