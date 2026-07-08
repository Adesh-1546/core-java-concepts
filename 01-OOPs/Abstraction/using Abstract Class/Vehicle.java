/*
Q: Demonstrate abstraction in Java using an abstract class.

Problem Statement:
Create an abstract class Vehicle with an abstract method start().
Then create two subclasses:
1. Car → starts with a key
2. Bike → starts with a self button

Override the start() method in both subclasses.

In the main method:
- Use a parent reference (Vehicle)
- Assign child objects (Car, Bike)
- Call start() to demonstrate abstraction
*/

abstract class Vehicle {

    // abstract method (no body)
    abstract void start();

    // concrete method (with body)
    void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self button");
    }
}

public class VehicleDriverClass {

    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();
        v.fuelType();

        v = new Bike();
        v.start();
        v.fuelType();
    }
}
