// Q2: Create a HashMap with at least 10 key-value pairs of the Student ID and Name
import java.util.HashMap;
import java.util.Map;

public class HashMapOps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, "Student " + i);
        }
        map.put(11, "New Student");
        HashMap<Integer, String> copyMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Contains Value 'New Student': " + map.containsValue("New Student"));
        System.out.println("Is map empty: " + map.isEmpty());
        System.out.println("Size of map: " + map.size());
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        map.remove(11);
        HashMap<Integer, String> anotherMap = new HashMap<>(map);
        System.out.println("Another map: " + anotherMap);
    }
}
