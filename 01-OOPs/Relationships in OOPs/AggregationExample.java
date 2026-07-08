package OOPS;

// Student class (independent)
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

// College class (uses Student)
class College {

    String collegeName;
    Student student; // Aggregation

    College(String collegeName, Student student) {
        this.collegeName = collegeName;
        this.student = student;
    }

    void showDetails() {
        System.out.println("College: " + collegeName);
        System.out.println("Student: " + student.name);
    }
}

public class AggregationExample {
    public static void main(String[] args) {

        Student s = new Student("Adesh"); // exists independently

        College c = new College("ABC College", s);
        c.showDetails();
    }
}
