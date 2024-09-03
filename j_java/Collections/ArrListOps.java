// Q1: Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
import java.util.ArrayList;
import java.util.Iterator;

public class ArrListOps {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add("Element " + i);
        }
        list.add("New Element");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        list.add(5, "Inserted Element");
        list.remove(3);
        list.set(2, "Updated Element");
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 5: " + list.get(5));
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Contains 'New Element': " + list.contains("New Element"));
        list.clear();
        System.out.println("ArrayList cleared. Size now: " + list.size());
    }
}
