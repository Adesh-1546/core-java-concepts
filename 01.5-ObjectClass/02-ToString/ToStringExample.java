package ObjectClass;

// Student class
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

public class ToStringExample {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Adesh");

        // Calls overridden toString()
        System.out.println(s1);

        // Explicit call
        System.out.println(s1.toString());
    }
}
