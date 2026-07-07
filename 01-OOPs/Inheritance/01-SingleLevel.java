class Animal {
    // Parent class method
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleLevelInheritanceDemo {
    public static void main(String[] args) {
        
        // Creating object of child class
        Dog d = new Dog();
        
        // Calling parent class method
        d.eat();
        
        // Calling child class method
        d.bark();
    }
}
