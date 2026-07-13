package ObjectClass;

// Student class
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {

        // Step 1: check same reference
        if (this == obj) {
            return true;
        }

        // Step 2: check null and type
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Step 3: type casting
        Student other = (Student) obj;

        // Step 4: compare fields
        return this.id == other.id && this.name.equals(other.name);
    }
}

public class EqualsExample {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Adesh");
        Student s2 = new Student(101, "Adesh");

        // Comparing objects
        System.out.println("Are objects equal? " + s1.equals(s2));
    }
}
