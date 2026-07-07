class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();   // parent reference, child object
        a.sound();       // calls Dog's method

        a = new Cat();
        a.sound();       // calls Cat's method
    }
}
