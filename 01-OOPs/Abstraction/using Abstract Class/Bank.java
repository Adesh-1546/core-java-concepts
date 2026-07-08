/*
Q: Demonstrate abstraction using an abstract class in a banking system.

Problem Statement:
Create an abstract class Bank with:
- An abstract method calculateInterest()
- A concrete method displayBankType()

Then create two subclasses:
1. SBI → fixed interest rate
2. HDFC → different interest rate

Override calculateInterest() in both classes.

In the main method:
- Use a parent reference (Bank)
- Assign child objects (SBI, HDFC)
- Call methods to demonstrate abstraction
*/

abstract class Bank {

    abstract void calculateInterest();

    void displayBankType() {
        System.out.println("This is a bank");
    }
}

class SBI extends Bank {

    @Override
    void calculateInterest() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

class HDFC extends Bank {

    @Override
    void calculateInterest() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class BankExample {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.calculateInterest();
        b.displayBankType();

        b = new HDFC();
        b.calculateInterest();
        b.displayBankType();
    }
}
