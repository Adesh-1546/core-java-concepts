package List;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // ---------------- ADD ELEMENTS ----------------
        list.add("A");              // adds at end
        list.add("B");
        list.add("C");

        list.addFirst("Start");     // adds at beginning
        list.addLast("End");        // adds at end

        System.out.println("After adding elements: " + list);

        // ---------------- ACCESS ELEMENT ----------------
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // ---------------- UPDATE ELEMENT ----------------
        list.set(2, "Updated");
        System.out.println("After updating index 2: " + list);

        // ---------------- REMOVE ELEMENT ----------------
        list.removeFirst();         // removes first element
        list.removeLast();          // removes last element
        list.remove("B");           // removes specific element

        System.out.println("After removal: " + list);

        // ---------------- CHECK SIZE ----------------
        System.out.println("Size: " + list.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating using for-each:");
        for (String item : list) {
            System.out.println(item);
        }

        // ---------------- CLEAR LIST ----------------
        list.clear();
        System.out.println("After clearing: " + list);
    }
}
