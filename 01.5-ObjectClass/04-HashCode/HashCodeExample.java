package ObjectClass;

// Student class
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;

        return id == other.id &&
               (name != null ? name.equals(other.name) : other.name == null);
    }

    // Override hashCode()
    @Override
    public int hashCode() {

        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class HashCodeExample {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Adesh");
        Student s2 = new Student(101, "Adesh");

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());

        System.out.println("Are equal? " + s1.equals(s2));
    }
}
