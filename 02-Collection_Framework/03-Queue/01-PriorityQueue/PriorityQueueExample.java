package Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // Creating PriorityQueue (default: Min-Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ---------------- ADD ELEMENTS ----------------
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        // Elements are not stored in insertion order
        System.out.println("PriorityQueue: " + pq);

        // ---------------- ACCESS HEAD ----------------
        System.out.println("Peek (smallest element): " + pq.peek());

        // ---------------- REMOVE ELEMENT ----------------
        System.out.println("Poll (remove smallest): " + pq.poll());
        System.out.println("After poll: " + pq);

        // ---------------- SIZE ----------------
        System.out.println("Size: " + pq.size());

        // ---------------- ITERATION ----------------
        System.out.println("Iterating PriorityQueue:");
        for (int num : pq) {
            System.out.println(num);
        }

        // ---------------- CLEAR ----------------
        pq.clear();
        System.out.println("After clearing: " + pq);
    }
}
