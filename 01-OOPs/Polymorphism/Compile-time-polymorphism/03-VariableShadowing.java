class Person {
    String name = "Default";

    void setName(String name) {
        // local variable shadows instance variable
        this.name = name;  // using 'this' to refer instance variable
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ShadowingExample {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Adesh");
        p.display();
    }
}
