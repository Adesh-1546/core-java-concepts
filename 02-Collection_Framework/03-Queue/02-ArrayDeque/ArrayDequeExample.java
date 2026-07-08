package Queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        // Creating ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // ---------------- ADD ELEMENTS ----------------
        deque.add(10);            // add at rear
        deque.addLast(20);        // add at rear
        deque.addFirst(5);        // add at front

        System.out.println("After adding: " + deque);

        // ---------------- ACCESS ELEMENTS ----------------
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // ---------------- REMOVE ELEMENTS ----------------
        deque.removeFirst();      // removes first
        deque.removeLast();       // removes last

        System.out.println("After removal: " + deque);

        // ---------------- OFFER / POLL ----------------
        deque.offerFirst(1);      // safe add at front
        deque.offerLast(30);      // safe add at rear

        System.out.println("After offer: " + deque);

        System.out.println("Poll first: " + deque.pollFirst()); // remove first
        System.out.println("Poll last: " + deque.pollLast());   // remove last

        System.out.println("After poll: " + deque);

        // ---------------- CHECK SIZE ----------------
        System.out.println("Size: " + deque.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating:");
        for (int num : deque) {
            System.out.println(num);
        }

        // ---------------- CLEAR ----------------
        deque.clear();
        System.out.println("After clearing: " + deque);
    }
}
