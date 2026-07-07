class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Adesh");

        s2.display();
    }
}
