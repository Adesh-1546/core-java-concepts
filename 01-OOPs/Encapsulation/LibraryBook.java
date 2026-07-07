/*
* Question:
* Write a Java program to demonstrate Encapsulation using a LibraryBook class.
* The class should have private data members (title, author, availableCopies)
* and provide methods to borrow and return books with proper validations.
  */

class LibraryBook {

```
// Private data members (data hiding)
private String title;
private String author;
private int availableCopies;

// Constructor to initialize book details
public LibraryBook(String title, String author, int availableCopies) {
	
	// Validate title
	if (title != null && !title.isEmpty()) {
		this.title = title;
	} else {
		this.title = "Unknown Title";
	}
	
	// Validate author
	if (author != null && !author.isEmpty()) {
		this.author = author;
	} else {
		this.author = "Unknown Author";
	}
	
	// Validate available copies
	if (availableCopies >= 0) {
		this.availableCopies = availableCopies;
	} else {
		this.availableCopies = 0;
		System.out.println("Invalid copies. Set to 0");
	}
}

// Method to borrow books
public void borrowBook(int num) {
	if (num > 0 && num <= availableCopies) {
		availableCopies -= num;
		System.out.println(num + " book(s) borrowed successfully");
	} else {
		System.out.println("Invalid request or insufficient copies");
	}
}

// Method to return books
public void returnBook(int num) {
	if (num > 0) {
		availableCopies += num;
		System.out.println(num + " book(s) returned successfully");
	} else {
		System.out.println("Enter valid amount");
	}
}

// Getter to check available copies
public int getAvailableCopies() {
	return availableCopies;
}
```

}

// Driver class
public class LibraryBook_Driver {
public static void main(String[] args) {

```
	// Creating object with valid data
	LibraryBook l = new LibraryBook("Java Basics", "Adesh", 5);
	
	// Borrowing books
	l.borrowBook(2);
	
	// Returning books
	l.returnBook(1);
	
	// Displaying available copies
	System.out.println("Available Copies: " + l.getAvailableCopies());
}
```

}

