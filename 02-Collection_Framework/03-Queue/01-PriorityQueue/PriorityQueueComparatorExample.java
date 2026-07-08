package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class PriorityQueueComparatorExample {

    public static void main(String[] args) {

        // Custom sorting using Comparator
        PriorityQueue<Student> pq = new PriorityQueue<>(new NameComparator());

        pq.add(new Student(3, "Adesh"));
        pq.add(new Student(1, "Rahul"));
        pq.add(new Student(2, "Amit"));

        System.out.println("PriorityQueue (Sorted by Name - Comparator):");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // sorted by name
        }
    }
}
