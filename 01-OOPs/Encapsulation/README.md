# 🔒 Encapsulation in Java

## 📌 Definition

Encapsulation is one of the core principles of Object-Oriented Programming (OOP).
It is the process of **wrapping data (variables) and methods (functions) into a single unit (class)** and **restricting direct access** to the data.

This is achieved by:

* Declaring variables as `private`
* Providing `public` getter and setter methods

---

## 🎯 Why Encapsulation?

* Improves **data security**
* Provides **controlled access**
* Makes code **flexible and maintainable**
* Prevents **unauthorized modification**

---

## ⚙️ How It Works

1. Make class variables `private`
2. Use `public` methods to access/update them
3. Add validation logic inside methods

---

## 📂 Examples Included

### 1️⃣ Bank Account System

* Fields: accountNumber, accountHolderName, balance
* Features:

  * Deposit money
  * Withdraw money
  * Balance validation

---

### 2️⃣ Employee Management

* Fields: name, salary
* Features:

  * Set/Get employee details
  * Increase salary by percentage
  * Salary validation

---

### 3️⃣ Library Book System

* Fields: title, author, availableCopies
* Features:

  * Borrow books
  * Return books
  * Copy validation

---

## 💡 Sample Code Snippet

```java
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

## 🧠 Key Points

* Use `private` for data hiding
* Use `public` methods for access
* Always validate input inside setters/methods
* Improves code quality and security

---

## 🚀 Conclusion

Encapsulation helps in building **secure, modular, and maintainable applications** by controlling how data is accessed and modified.

---

## 👨‍💻 Author

Adesh Pol

