package Queue;

import java.util.PriorityQueue;

// Class implementing Comparable
class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by id (Min-Heap based on id)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class PriorityQueueComparableExample {

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(3, "Adesh"));
        pq.add(new Student(1, "Rahul"));
        pq.add(new Student(2, "Amit"));

        System.out.println("PriorityQueue (Sorted by ID - Comparable):");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // always gives smallest id first
        }
    }
}
