// 1. Class A (Super Class)
class A {
   
    int x = 10;
    int y = 20;

    
    void display() {
        System.out.println("Class A: x = " + x + ", y = " + y);
    }
}


class B extends A {
    // Data members
    int x = 30;
    int z = 40;

    
    @Override
    void display() {
        System.out.println("Class B: x = " + x + ", z = " + z);
    }
}

class C extends B {
    // Data members
    int y = 50;
    int z = 60;

    @Override
    void display() {
        System.out.println("Class C: y = " + y + ", z = " + z);
    }
}

public class TestDataMembers {
    public static void main(String[] args) {
        A objA = new A();
        objA.display();
        B objB = new B();
        objB.display();
        C objC = new C();
        objC.display();
        A ref1 = objB;
        A ref2 = objC;

        System.out.println("Reference to B, x = " + ref1.x + ", y = " + ref1.y);
        System.out.println("Reference to C, x = " + ref2.x + ", y = " + ref2.y);
    }
}
