interface Animal {
    void eat();
}

interface Pet {
    void play();
}

// Parent class implementing multiple interfaces
class Dog implements Animal, Pet {
    
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void play() {
        System.out.println("Dog is playing");
    }
    
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class (multilevel)
class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        
        Puppy p = new Puppy();
        
        p.eat();   // from Animal interface
        p.play();  // from Pet interface
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}

/*
OUTPUT:
Dog is eating
Dog is playing
Dog is barking
Puppy is weeping
*/
