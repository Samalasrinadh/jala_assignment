// Q4: Class with public fields and methods, access them in the same package and different package

package samepkg;

public class PubClass {
    public int num = 40;
    public String text = "Public";
    public void display() {
        System.out.println("Public Method: num = " + num + ", text = " + text);
    }
}

class SamePkgAccess {
    public static void main(String[] args) {
        PubClass obj = new PubClass();
        System.out.println("Public num: " + obj.num);
        System.out.println("Public text: " + obj.text);

        obj.display();
    }
}
package diffpkg;
import samepkg.PubClass;
class DiffPkgAccess {
    public static void main(String[] args) {
        PubClass obj = new PubClass();
        System.out.println("Public num (diff pkg): " + obj.num);
        System.out.println("Public text (diff pkg): " + obj.text);
        obj.display();
    }
}
