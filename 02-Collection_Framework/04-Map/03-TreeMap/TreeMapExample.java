package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        // Creating TreeMap (stores keys in sorted order)
        TreeMap<Integer, String> map = new TreeMap<>();

        // ---------------- PUT (ADD ELEMENTS) ----------------
        map.put(3, "Amit");
        map.put(1, "Adesh");
        map.put(2, "Rahul");
        map.put(4, "John");

        System.out.println("TreeMap (sorted by keys): " + map);

        // ---------------- ACCESS ELEMENT ----------------
        System.out.println("Value for key 2: " + map.get(2));

        // ---------------- SPECIAL METHODS ----------------
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // ---------------- REMOVE ----------------
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + map.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating TreeMap:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------------- CLEAR ----------------
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
