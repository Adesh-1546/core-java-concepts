# Types of Exceptions in Java

In Java, exceptions are broadly classified into two main types:

1. Checked Exceptions
2. Unchecked Exceptions

---

## 🔹 1. Checked Exceptions

Checked exceptions are exceptions that are checked at compile time.

* The compiler forces you to handle these exceptions
* Must be handled using try-catch or declared using `throws`

### 📌 Examples

* IOException
* FileNotFoundException
* SQLException

---

## 🔹 2. Unchecked Exceptions

Unchecked exceptions are exceptions that occur at runtime.

* Not checked by the compiler
* Handling is optional

### 📌 Examples

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---

## ⚖️ Difference Between Checked and Unchecked Exceptions

| Feature             | Checked Exception      | Unchecked Exception |
| ------------------- | ---------------------- | ------------------- |
| Checked by Compiler | ✔ Yes                  | ❌ No                |
| Occurs at           | Compile Time (checked) | Runtime             |
| Handling Required   | ✔ Yes                  | ❌ No                |
| Examples            | IOException            | ArithmeticException |

---

## ⚙️ Exception Hierarchy (Simplified)

```java
Throwable
   ├── Exception
   │     ├── Checked Exceptions
   │     └── RuntimeException (Unchecked Exceptions)
   └── Error
```

---

## ⚠️ Important Notes

* Checked exceptions must be handled or declared
* Unchecked exceptions usually occur due to programming errors
* Errors (like OutOfMemoryError) should not be handled

---

## 🔥 Interview Questions

### 1. What are types of exceptions in Java?

Checked and Unchecked exceptions.

---

### 2. What is the difference between checked and unchecked exceptions?

Checked exceptions are handled at compile time, while unchecked occur at runtime.

---

### 3. Why are checked exceptions used?

To ensure critical exceptions are handled by the programmer.

---

### 4. Are unchecked exceptions bad?

No, they indicate logical errors in code.

---

## 🚀 Summary

Java exceptions are divided into checked and unchecked types. Understanding their behavior is essential for writing reliable and error-free programs.
