# Abstraction in Java

Abstraction is the process of hiding implementation details and showing only essential features to the user.

It helps in reducing complexity and improving code maintainability.

---

## 🔑 Types of Abstraction

### 1. Abstract Class

An abstract class is a class that cannot be instantiated and may contain both:

* Abstract methods (without body)
* Concrete methods (with implementation)

#### Key Points:

* Declared using `abstract` keyword
* Can have constructors and instance variables
* Subclasses must implement abstract methods

---

### 2. Interface

An interface is a blueprint of a class that contains abstract methods.

#### Key Points:

* Methods are `public` and `abstract` by default
* Supports multiple inheritance
* Implemented using `implements` keyword

---

## 🧠 Real-Life Example

A vehicle:

* You know how to start and stop it
* But you don’t know the internal engine working

This is abstraction → hiding internal details and showing only functionality.

---

## ⚠️ Important Differences

| Feature     | Abstract Class      | Interface       |
| ----------- | ------------------- | --------------- |
| Methods     | Abstract + Concrete | Mostly Abstract |
| Inheritance | Single              | Multiple        |
| Keyword     | extends             | implements      |
| Constructor | Allowed             | Not Allowed     |

---

## 📌 Why Abstraction?

* Hides complex implementation
* Improves security
* Makes code easier to maintain
* Helps in achieving loose coupling

---

## 💡 Where it is used

* Designing APIs
* Frameworks like Spring Boot
* Large-scale applications

---

## 🚀 Summary

Abstraction allows focusing on what an object does rather than how it does it.
It is essential for building scalable, maintainable, and flexible Java applications.
