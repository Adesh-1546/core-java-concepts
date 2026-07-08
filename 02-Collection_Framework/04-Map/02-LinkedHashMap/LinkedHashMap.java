package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Creating LinkedHashMap (maintains insertion order)
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // ---------------- PUT (ADD ELEMENTS) ----------------
        map.put(3, "Amit");
        map.put(1, "Adesh");
        map.put(2, "Rahul");

        map.put(2, "Updated Rahul"); // duplicate key → value updated

        System.out.println("LinkedHashMap: " + map);

        // ---------------- GET VALUE ----------------
        System.out.println("Value for key 1: " + map.get(1));

        // ---------------- REMOVE ----------------
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + map.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating using entrySet:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------------- KEYSET ----------------
        System.out.println("Keys: " + map.keySet());

        // ---------------- VALUES ----------------
        System.out.println("Values: " + map.values());

        // ---------------- CLEAR ----------------
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
