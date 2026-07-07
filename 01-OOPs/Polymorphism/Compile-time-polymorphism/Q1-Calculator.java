/*
Q: Demonstrate compile-time polymorphism using method overloading.

Problem Statement:
Create a class Calculator with multiple add() methods:
1. Add two integers
2. Add three integers
3. Add two double values

Show how the same method name behaves differently based on parameters.
*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(2, 3));
        System.out.println("Sum of 3 ints: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}
