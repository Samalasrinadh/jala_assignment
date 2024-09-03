// 1. Class A (Super Class)
class A {
    // Data members
    int x = 10;
    int y = 20;

    // Methods specific to class A
    void methodA1() {
        System.out.println("Method A1 in Class A");
    }

    void methodA2() {
        System.out.println("Method A2 in Class A");
    }

    // Overridden method
    void commonMethod() {
        System.out.println("Common Method in Class A");
    }
}

// 2. Class B (Subclass of A)
class B extends A {
    // Data members
    int x = 30;
    int z = 40;

    // Methods specific to class B
    void methodB1() {
        System.out.println("Method B1 in Class B");
    }

    void methodB2() {
        System.out.println("Method B2 in Class B");
    }

    // Overridden method
    @Override
    void commonMethod() {
        System.out.println("Common Method in Class B");
    }
}

// 3. Class C (Subclass of B)
class C extends B {
    // Data members
    int y = 50;
    int z = 60;

    // Methods specific to class C
    void methodC1() {
        System.out.println("Method C1 in Class C");
    }

    void methodC2() {
        System.out.println("Method C2 in Class C");
    }

    // Overridden method
    @Override
    void commonMethod() {
        System.out.println("Common Method in Class C");
    }
}

// 4. Main class with main method
public class TestInheritance {
    public static void main(String[] args) {
        // Create object of class A
        A objA = new A();
        objA.methodA1();
        objA.methodA2();
        objA.commonMethod();

        // Create object of class B
        B objB = new B();
        objB.methodA1();
        objB.methodB1();
        objB.methodB2();
        objB.commonMethod();

        // Create object of class C
        C objC = new C();
        objC.methodA1();
        objC.methodB1();
        objC.methodC1();
        objC.methodC2();
        objC.commonMethod();

        // Call overridden method using superclass reference
        A ref1 = objB;
        A ref2 = objC;

        ref1.commonMethod(); // Should call commonMethod() in B
        ref2.commonMethod(); // Should call commonMethod() in C
    }
}
