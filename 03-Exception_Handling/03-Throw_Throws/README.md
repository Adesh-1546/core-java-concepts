# throw, throws and Exception Propagation in Java

In Java, `throw`, `throws`, and exception propagation are closely related concepts used in exception handling.

---

## 🔹 throw Keyword

* Used to **explicitly throw an exception**
* Used inside a method
* Throws one exception at a time

### 📌 Syntax

```java
throw new Exception("Error message");
```

### 💡 Example Use Case

* Input validation (age, login, etc.)

---

## 🔹 throws Keyword

* Used to **declare exceptions**
* Used in method signature
* Can declare multiple exceptions
* Helps in **exception propagation**

### 📌 Syntax

```java
public void method() throws IOException
```

---

## 🔹 Exception Propagation

Exception propagation is the process where an exception is passed from one method to another in the call stack until it is handled.

---

### ⚙️ How It Works

* If a method does not handle an exception
* It passes the exception to the caller method
* This continues until:

  * Exception is handled, OR
  * Program terminates

---

### 🔁 Flow Example

```java
method3() → method2() → method1() → main()
```

---

### 📌 Important Points

* **Unchecked exceptions** are propagated automatically
* **Checked exceptions** require `throws` for propagation
* `throws` is used to pass responsibility to the caller
* Propagation follows **call stack (bottom to top)**

---

### 💡 Example

```java
public static void method3() {
    int result = 10 / 0; // exception occurs
}

public static void method2() {
    method3(); // no handling → propagates
}

public static void method1() {
    method2(); // propagates further
}

public static void main(String[] args) {
    method1(); // finally reaches here
}
```

---

## ⚖️ Difference Between throw and throws

| Feature    | throw             | throws            |
| ---------- | ----------------- | ----------------- |
| Purpose    | Throw exception   | Declare exception |
| Usage      | Inside method     | Method signature  |
| Exceptions | One               | Multiple          |
| Role       | Creates exception | Helps propagation |

---

## 🔥 Interview Questions

### 1. What is throw?

Used to explicitly throw an exception.

---

### 2. What is throws?

Used to declare exceptions and enable propagation.

---

### 3. What is exception propagation?

Passing exception from one method to another until handled.

---

### 4. Which exceptions are propagated automatically?

Unchecked exceptions.

---

### 5. How to stop propagation?

By handling exception using try-catch.

---

## 🚀 Summary

* `throw` is used to create and throw exceptions
* `throws` is used to declare exceptions and enable propagation
* Exception propagation allows exceptions to travel through the call stack until handled
