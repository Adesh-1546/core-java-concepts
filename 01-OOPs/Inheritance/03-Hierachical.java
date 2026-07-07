class Animal {
    // Parent class
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// First child class
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Second child class
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        
        // Object of Dog
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method
        
        // Object of Cat
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat's own method
    }
}

/*
OUTPUT
Animal is eating
Dog is barking
Animal is eating
Cat is meowing
*/
