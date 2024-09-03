// Q3: Create a HashSet with at least 10 elements of type String
import java.util.HashSet;

public class HashSetOps {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set.add("Element " + i);
        }

        set.add("New Element");
        System.out.println("Contains 'Element 5': " + set.contains("Element 5"));
        set.remove("Element 3");
        System.out.println("Size of HashSet: " + set.size());
        for (String element : set) {
            System.out.println(element);
        }
        set.clear();
        System.out.println("HashSet cleared. Size now: " + set.size());
    }
}
