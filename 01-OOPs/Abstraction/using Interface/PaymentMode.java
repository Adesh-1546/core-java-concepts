/*
Q: Demonstrate abstraction in Java using an interface.

Problem Statement:
Create an interface Payment with a method pay().
Then create two classes:
1. CreditCardPayment
2. UpiPayment

Both classes should implement the Payment interface and provide their own implementation of pay().

In the main method:
- Use interface reference (Payment)
- Assign different objects (CreditCardPayment, UpiPayment)
- Call pay() to demonstrate abstraction
*/

interface Payment {

    // by default: public and abstract
    void pay();
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay();

        p = new UpiPayment();
        p.pay();
    }
}
