// Q3: Class with protected fields and methods, access them in same package and different package

package samepkg;

class ProtClass {
    // Protected fields
    protected int num = 30;
    protected String text = "Java";

    // Protected method
    protected void show() {
        System.out.println("Protected Method: num = " + num + ", text = " + text);
    }
}

// Another class in the same package accessing protected fields and methods
class SamePkgClass {
    public static void main(String[] args) {
        ProtClass obj = new ProtClass();
        // Access protected fields
        System.out.println("Protected num: " + obj.num);
        System.out.println("Protected text: " + obj.text);
        // Call protected method
        obj.show();
    }
}

package diffpkg;
import samepkg.ProtClass;

// Child class in a different package accessing protected fields and methods
class ChildClass extends ProtClass {
    public void access() {
        // Access protected fields
        System.out.println("Protected num (from child): " + num);
        System.out.println("Protected text (from child): " + text);
        // Call protected method
        show();
    }
}

// Non-child class in a different package trying to access protected fields and methods
class DiffPkgClass {
    public static void main(String[] args) {
        ProtClass obj = new ProtClass();
        // Cannot access protected fields or methods directly
        // System.out.println(obj.num); // Error
        // obj.show(); // Error
    }
}
