package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        // Creating LinkedHashSet (maintains insertion order)
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // ---------------- ADD ELEMENTS ----------------
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A"); // duplicate (ignored)

        System.out.println("LinkedHashSet elements: " + set);

        // ---------------- CHECK ELEMENT ----------------
        System.out.println("Contains B? " + set.contains("B"));

        // ---------------- REMOVE ELEMENT ----------------
        set.remove("B");
        System.out.println("After removing B: " + set);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + set.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating LinkedHashSet:");
        for (String item : set) {
            System.out.println(item);
        }

        // ---------------- CLEAR ----------------
        set.clear();
        System.out.println("After clearing: " + set);
    }
}
