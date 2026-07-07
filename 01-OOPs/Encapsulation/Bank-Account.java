/*
* Question:
* Write a Java program to demonstrate Encapsulation by creating a Bank Account class.
* The class should have private data members and provide public methods to deposit,
* withdraw, and check balance with proper validations.
  */
class Bank_Account {

```
// Private data members (data hiding)
private int accountNumber;
private String accountHolderName;
private double balance;

// Constructor to initialize account details
public Bank_Account(int accountNumber, String accountHolderName, double balance) {
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	
	// Validate initial balance
	if (balance >= 0) {
		this.balance = balance;
	} else {
		this.balance = 0;
		System.out.println("Invalid initial balance. Set to 0");
	}
}

// Method to deposit money into account
public void deposit(double amount) {
	if (amount > 0) {
		balance += amount;
		System.out.println("Amount deposited successfully");
	} else {
		System.out.println("Invalid deposit amount");
	}
}

// Method to withdraw money from account
public void withdraw(double amount) {
	// Check if amount is valid and sufficient balance exists
	if (amount > 0 && amount <= balance) {
		balance -= amount;
		System.out.println("Amount withdrawn successfully");
	} else {
		System.out.println("Invalid withdrawal amount or insufficient balance");
	}
}

// Getter method to access balance (no direct access to variable)
public double getBalance() {
	return balance;
}
```

}

// Driver class to test the Bank_Account class
public class Bank_Account_Driver {
public static void main(String[] args) {

```
	// Creating object of Bank_Account
	Bank_Account b = new Bank_Account(101, "Adesh", 5000);
	
	// Performing deposit operation
	b.deposit(2000);
	
	// Performing withdrawal operation
	b.withdraw(1000);
	
	// Displaying final balance
	System.out.println("Balance: " + b.getBalance());
}
```

}

