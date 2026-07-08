package Set;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        // Creating TreeSet (stores elements in sorted order)
        TreeSet<Integer> set = new TreeSet<>();

        // ---------------- ADD ELEMENTS ----------------
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(10); // duplicate (ignored)

        System.out.println("TreeSet elements (sorted): " + set);

        // ---------------- ACCESS (SPECIAL METHODS) ----------------
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // ---------------- REMOVE ELEMENT ----------------
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + set.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating TreeSet:");
        for (int num : set) {
            System.out.println(num);
        }

        // ---------------- CHECK ELEMENT ----------------
        System.out.println("Contains 30? " + set.contains(30));

        // ---------------- CLEAR ----------------
        set.clear();
        System.out.println("After clearing: " + set);
    }
}
