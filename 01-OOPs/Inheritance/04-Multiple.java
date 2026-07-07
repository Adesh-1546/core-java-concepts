interface Father {
    void money();
}

interface Mother {
    void care();
}

// Child class implementing multiple interfaces
class Child implements Father, Mother {
    
    public void money() {
        System.out.println("Father provides money");
    }
    
    public void care() {
        System.out.println("Mother provides care");
    }
    
    public void study() {
        System.out.println("Child is studying");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        
        Child c = new Child();
        
        c.money();  // from Father
        c.care();   // from Mother
        c.study();  // Child's own method
    }
}

/*
OUTPUT:
Father provides money
Mother provides care
Child is studying
*/
