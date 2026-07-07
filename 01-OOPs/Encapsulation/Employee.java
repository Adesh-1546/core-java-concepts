/*
* Question:
* Write a Java program to demonstrate Encapsulation using an Employee class.
* The class should have private data members (name and salary) and provide
* public getter and setter methods. Also include a method to increase salary
* by a given percentage with proper validation.
  */

class Employee {

```
// Private data members (data hiding)
private String name;
private double salary;

// Getter for name
public String getName() {
	return name;
}

// Setter for name
public void setName(String name) {
	this.name = name;
}

// Getter for salary
public double getSalary() {
	return salary;
}

// Setter for salary with validation
public void setSalary(double salary) {
	if (salary > 0) {
		this.salary = salary;
	} else {
		System.out.println("Invalid salary amount");
	}
}

// Method to increase salary by given percentage
public void increaseSalary(double percentage) {
	if (percentage > 0) {
		double increment = salary * percentage / 100;
		salary += increment;
		System.out.println("Salary increased by " + percentage + "%");
	} else {
		System.out.println("Invalid percentage");
	}
}
```

}

// Driver class to test Employee class
public class Employee_Driver {
public static void main(String[] args) {

```
	// Creating Employee object
	Employee e = new Employee();
	
	// Setting values using setters
	e.setName("Adesh");
	e.setSalary(30000);
	
	// Increasing salary
	e.increaseSalary(10);
	
	// Displaying updated details
	System.out.println("Name: " + e.getName());
	System.out.println("Salary: " + e.getSalary());
}
```

}

