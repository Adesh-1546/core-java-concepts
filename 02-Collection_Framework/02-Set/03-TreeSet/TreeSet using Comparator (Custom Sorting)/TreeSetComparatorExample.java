package Set;

import java.util.Comparator;
import java.util.TreeSet;

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

public class TreeSetComparatorExample {

    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>(new NameComparator());

        set.add(new Student(3, "Adesh"));
        set.add(new Student(1, "Rahul"));
        set.add(new Student(2, "Amit"));

        System.out.println("Sorted by Name (Comparator):");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
