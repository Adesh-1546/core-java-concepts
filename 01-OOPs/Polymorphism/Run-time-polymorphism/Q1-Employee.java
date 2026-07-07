/*
Q: Demonstrate runtime polymorphism (method overriding) in Java using an Employee system.

Problem Statement:
Create a base class Employee with a method calculateSalary().
Then create two subclasses:
1. FullTimeEmployee → salary is fixed
2. PartTimeEmployee → salary is calculated based on hoursWorked * ratePerHour

Use method overriding so that each subclass provides its own implementation of calculateSalary().

In the main method:
- Use a parent class reference (Employee)
- Assign child class objects (FullTimeEmployee, PartTimeEmployee)
- Call calculateSalary() to demonstrate dynamic method dispatch (runtime polymorphism)
*/

class Employee {
    public void calculateSalary() {
        System.out.println("xyz content");
    }
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full Time Employee Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    public PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Employee Salary: " + salary);
    }
}

public class Employee_Main {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee(5000);
        e.calculateSalary();

        e = new PartTimeEmployee(5, 100);
        e.calculateSalary();
    }
}
