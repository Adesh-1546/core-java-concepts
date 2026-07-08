package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

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

public class TreeMapComparatorExample {

    public static void main(String[] args) {

        // TreeMap with Comparator (sorted by name)
        TreeMap<Student, String> map =
                new TreeMap<>(new NameComparator());

        map.put(new Student(3, "Amit"), "Developer");
        map.put(new Student(1, "Adesh"), "Tester");
        map.put(new Student(2, "Rahul"), "Manager");

        System.out.println("TreeMap sorted by Name (Comparator):");

        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
