# Polymorphism in Java

Polymorphism means “many forms”. It allows a method or object to behave differently based on the context.

It is one of the core principles of Object-Oriented Programming (OOP).

---

## 🔑 Types of Polymorphism

### 1. Compile-Time Polymorphism (Static Binding)

This type of polymorphism is achieved when the method call is resolved at compile time.

#### Achieved using:

* Method Overloading
* Constructor Overloading

#### Key Points:

* Same method name, different parameters
* Improves code readability
* Faster execution (decided at compile time)

---

### 2. Runtime Polymorphism (Dynamic Binding)

This type of polymorphism is achieved when the method call is resolved at runtime.

#### Achieved using:

* Method Overriding

#### Key Points:

* Same method name and same parameters
* Requires inheritance
* Method call is decided based on the object

---

## 🧠 Real-Life Example

A person can behave differently in different roles:

* As a student
* As an employee

Similarly, a method behaves differently depending on the object calling it.

---

## ⚠️ Important Notes

* Method Overloading → Compile-time polymorphism
* Method Overriding → Runtime polymorphism
* Constructor Overloading → Compile-time polymorphism
* Polymorphism improves flexibility and scalability of code

---

## 📌 Advantages

* Code reusability
* Improved flexibility
* Easier maintenance
* Better readability

---

## 🚀 Summary

Polymorphism allows one interface to be used for different data types or objects. It plays a key role in building scalable and maintainable Java applications.

