// 3. Print static variables in instance methods
class TestClass{
    static int statVar1=10;
    static int statVar2=20;
    
    int instVar1=30;
    int instVar2=40;
    
    void instMethod1(){
        System.out.println("Static Variable 1: "+statVar1);
        System.out.println("Static Variable 2: "+statVar2);
    }
    
    public static void main(String[] args){
        TestClass obj=new TestClass();
        obj.instMethod1();
    }
}
