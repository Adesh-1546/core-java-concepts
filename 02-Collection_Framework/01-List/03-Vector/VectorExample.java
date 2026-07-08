package List;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // Creating a Vector (synchronized, thread-safe)
        Vector<Integer> vector = new Vector<>();

        // ---------------- ADD ELEMENTS ----------------
        vector.add(10);
        vector.add(20);
        vector.add(30);

        vector.add(1, 15); // insert at index

        System.out.println("After adding elements: " + vector);

        // ---------------- ACCESS ELEMENT ----------------
        System.out.println("Element at index 2: " + vector.get(2));

        // ---------------- UPDATE ELEMENT ----------------
        vector.set(2, 25);
        System.out.println("After update: " + vector);

        // ---------------- REMOVE ELEMENT ----------------
        vector.remove(1); // remove by index
        System.out.println("After removal: " + vector);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + vector.size());

        // ---------------- ITERATION ----------------
        System.out.println("Using for-each loop:");
        for (int num : vector) {
            System.out.println(num);
        }

        // ---------------- CHECK THREAD-SAFE ----------------
        // Vector is synchronized (thread-safe by default)

        // ---------------- CLEAR ----------------
        vector.clear();
        System.out.println("After clearing: " + vector);
    }
}
