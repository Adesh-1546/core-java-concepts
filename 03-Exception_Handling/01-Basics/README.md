# Exception Handling Basics in Java

Exception Handling in Java is used to handle runtime errors and ensure smooth execution of the program.

---

## 📌 What is an Exception?

An exception is an unwanted event that occurs during program execution and disrupts the normal flow of the program.

---

## 🔑 Why Exception Handling?

* Prevents program crash
* Maintains normal flow of execution
* Helps in debugging
* Improves program reliability

---

## ⚙️ Keywords Used

### 1. try

* Contains code that may throw an exception

### 2. catch

* Handles the exception

### 3. finally

* Always executes (used for cleanup)

---

## 🔁 Basic Syntax

```java
try {
    // risky code
} catch (Exception e) {
    // handling code
} finally {
    // always executes
}
```

---

## 💡 Example Scenario

* Dividing a number by zero
* Accessing invalid array index
* File not found

---

## 🔥 Interview Questions

### 1. What is Exception Handling?

A mechanism to handle runtime errors and maintain program flow.

---

### 2. What is the purpose of try-catch?

To handle exceptions and prevent program crash.

---

### 3. What is finally block?

A block that always executes, used for cleanup.

---

### 4. Can we write try without catch?

Yes, if finally block is present.

---

### 5. Can we write catch without try?

No.

---

## ⚠️ Best Practices

* Handle specific exceptions (not generic Exception)
* Do not leave catch block empty
* Use finally for cleanup tasks

---

## 🚀 Summary

Exception handling ensures that a program does not terminate abruptly and allows graceful handling of errors.
