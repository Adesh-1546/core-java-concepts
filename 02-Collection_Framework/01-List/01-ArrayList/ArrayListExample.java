package List;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList (stores Integer objects)
        ArrayList<Integer> list = new ArrayList<>();

        // ---------------- ADD ELEMENTS ----------------
        list.add(10);              // adds element at end
        list.add(20);
        list.add(30);
        list.add(1, 15);           // adds element at index 1

        System.out.println("After adding elements: " + list);

        // ---------------- ACCESS ELEMENT ----------------
        int value = list.get(2);   // get element at index 2
        System.out.println("Element at index 2: " + value);

        // ---------------- UPDATE ELEMENT ----------------
        list.set(2, 25);           // replace element at index 2
        System.out.println("After updating index 2: " + list);

        // ---------------- REMOVE ELEMENT ----------------
        list.remove(1);            // removes element at index 1
        System.out.println("After removing index 1: " + list);

        // ---------------- CHECK SIZE ----------------
        System.out.println("Size of list: " + list.size());

        // ---------------- CHECK IF CONTAINS ----------------
        boolean exists = list.contains(25); // checks if element exists
        System.out.println("List contains 25? " + exists);

        // ---------------- ITERATION (for loop) ----------------
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // ---------------- ITERATION (enhanced for loop) ----------------
        System.out.println("Using for-each loop:");
        for (int num : list) {
            System.out.println(num);
        }

        // ---------------- CLEAR LIST ----------------
        list.clear();              // removes all elements
        System.out.println("After clearing list: " + list);
    }
}
