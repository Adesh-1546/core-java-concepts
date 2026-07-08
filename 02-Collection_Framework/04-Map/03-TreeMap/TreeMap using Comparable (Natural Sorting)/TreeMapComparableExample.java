package Map;

import java.util.Map;
import java.util.TreeMap;

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
        return Integer.compare(this.id, s.id);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class TreeMapComparableExample {

    public static void main(String[] args) {

        // TreeMap with Comparable (sorted by id)
        TreeMap<Student, String> map = new TreeMap<>();

        map.put(new Student(3, "Amit"), "Developer");
        map.put(new Student(1, "Adesh"), "Tester");
        map.put(new Student(2, "Rahul"), "Manager");

        System.out.println("TreeMap sorted by ID (Comparable):");

        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
