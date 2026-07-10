# Custom Exception in Java

Custom exceptions in Java are user-defined exceptions created to handle application-specific errors.

Instead of using built-in exceptions, we can create our own exception classes to make the code more meaningful and readable.

---

## 📌 Why Custom Exception?

* To handle business logic errors
* To provide meaningful error messages
* To improve code readability
* To separate system errors from application errors

---

## 🔑 How to Create Custom Exception (Steps)

### Step 1: Create a class

* Create a new class
* Extend `Exception` (checked) or `RuntimeException` (unchecked)

### Step 2: Add constructor (optional but recommended)

* Use `super(message)` to pass custom message

### Step 3: (Optional) Override `getMessage()`

* To return custom message

### Step 4: Use `throw`

* Throw exception manually when condition fails

### Step 5: Use `throws`

* Declare exception in method signature

### Step 6: Handle using try-catch

* Catch and handle the exception

---

## 🔹 Ways to Define Custom Exception

### 1. Using `super()` (Recommended)

* Pass dynamic message using constructor
* Flexible and widely used

---

### 2. Overriding `getMessage()`

* Return fixed message
* Less flexible

---

## ⚙️ Example Flow

```java
validate() → throw CustomException → handled in main()
```

---

## ⚖️ Checked vs Unchecked Custom Exception

| Type      | Extend           |
| --------- | ---------------- |
| Checked   | Exception        |
| Unchecked | RuntimeException |

---

## 💡 When to Use Custom Exception

* Age validation
* Bank balance validation
* Login authentication
* Business rule validation

---

## 🔥 Interview Questions

### 1. What is a custom exception?

User-defined exception created by extending Exception class.

---

### 2. How do you create a custom exception?

By extending Exception or RuntimeException.

---

### 3. Why use super() in custom exception?

To pass dynamic error message to parent class.

---

### 4. Difference between super() and getMessage()?

| super()         | getMessage()  |
| --------------- | ------------- |
| Dynamic message | Fixed message |
| Recommended     | Less used     |

---

### 5. Can we create unchecked custom exception?

Yes, by extending RuntimeException.

---

## ⚠️ Best Practices

* Use meaningful exception names
* Prefer constructor with `super()`
* Do not overuse custom exceptions
* Use for business logic, not system errors

---

## 🚀 Summary

Custom exceptions help in handling application-specific errors effectively. They improve readability and make the code more structured and maintainable.
