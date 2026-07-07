class Animal {
    // Grandparent class
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    // Parent class
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    // Child class
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        
        // Creating object of lowest child class
        Puppy p = new Puppy();
        
        // Accessing all levels of methods
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}

/*
OUTPUT
Animal is eating
Dog is barking
Puppy is weeping
*/
