package Set;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        // Creating HashSet (stores unique elements)
        HashSet<Integer> set = new HashSet<>();

        // ---------------- ADD ELEMENTS ----------------
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate (will not be added)

        System.out.println("HashSet elements: " + set);

        // ---------------- CHECK ELEMENT ----------------
        System.out.println("Contains 20? " + set.contains(20));

        // ---------------- REMOVE ELEMENT ----------------
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + set.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating HashSet:");
        for (int num : set) {
            System.out.println(num);
        }

        // ---------------- CLEAR ----------------
        set.clear();
        System.out.println("After clearing: " + set);
    }
}
