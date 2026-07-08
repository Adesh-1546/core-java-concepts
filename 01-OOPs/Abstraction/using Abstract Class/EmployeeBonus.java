/*
Q: Demonstrate abstraction using an abstract class for employee bonus calculation.

Problem Statement:
Create an abstract class Employee with:
- An abstract method calculateBonus()
- A concrete method displayRole()

Then create two subclasses:
1. Manager → gets fixed bonus
2. Developer → bonus based on performance

Override calculateBonus() in both classes.

In the main method:
- Use parent reference (Employee)
- Assign child objects (Manager, Developer)
- Call methods to demonstrate abstraction
*/

abstract class Employee {

    abstract void calculateBonus();

    void displayRole() {
        System.out.println("Employee Role");
    }
}

class Manager extends Employee {

    @Override
    void calculateBonus() {
        System.out.println("Manager Bonus: 10000");
    }
}

class Developer extends Employee {

    int performanceScore;

    Developer(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    void calculateBonus() {
        int bonus = performanceScore * 1000;
        System.out.println("Developer Bonus: " + bonus);
    }
}

public class EmployeeBonusExample {

    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        e.calculateBonus();
        e.displayRole();

        e = new Developer(8);
        e.calculateBonus();
        e.displayRole();
    }
}
