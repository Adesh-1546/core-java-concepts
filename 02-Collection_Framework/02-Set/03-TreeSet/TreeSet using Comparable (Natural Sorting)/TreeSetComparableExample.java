package Set;

import java.util.TreeSet;

// Class implementing Comparable
class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by id
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class TreeSetComparableExample {

    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();

        set.add(new Student(3, "Adesh"));
        set.add(new Student(1, "Rahul"));
        set.add(new Student(2, "Amit"));

        System.out.println("Sorted by ID (Comparable):");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
