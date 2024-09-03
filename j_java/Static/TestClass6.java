// 6. Print all the static, instance variables in main method
class TestClass{
    static int statVar1=10;
    static int statVar2=20;
    
    int instVar1=30;
    int instVar2=40;
    
    public static void main(String[] args){
        System.out.println("Static Variable 1: "+statVar1);
        System.out.println("Static Variable 2: "+statVar2);
        
        TestClass obj=new TestClass();
        System.out.println("Instance Variable 1: "+obj.instVar1);
        System.out.println("Instance Variable 2: "+obj.instVar2);
    }
}
