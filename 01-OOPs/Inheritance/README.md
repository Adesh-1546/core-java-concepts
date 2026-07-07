# Inheritance in Java

Inheritance is a mechanism in Java where one class (child/subclass) acquires the properties and behavior of another class (parent/superclass).

It helps in code reusability and establishes IS-A-relationship between classes.

---

## 🔑 Key Concepts

* Parent class → Superclass
* Child class → Subclass
* Achieved using the `extends` keyword
* Child class can access public and protected members of the parent class

---

## 💡 Why Inheritance?

* Promotes code reusability
* Reduces code duplication
* Improves code organization
* Supports hierarchical classification

---

## 🧠 Real-Life Example

Animal → Dog

A dog inherits common properties like eating and sleeping from Animal and can also have its own specific behavior like barking.

---

## 📚 Types of Inheritance in Java

### 1. Single Inheritance

One child class inherits from one parent class.

---

### 2. Multilevel Inheritance

A class inherits from a parent class, and another class further inherits from that child class.

---

### 3. Hierarchical Inheritance

Multiple child classes inherit from a single parent class.

---

## ⚠️ Note

Java does NOT support multiple inheritance using classes to avoid ambiguity (diamond problem).
However, multiple inheritance can be achieved using interfaces.

---

## 📌 Advantages

* Code reuse
* Easy maintenance
* Better organization of classes
* Extensibility

---

## 🚀 Summary

Inheritance allows classes to reuse existing code and build relationships between them. It is widely used in real-world applications to create scalable and maintainable systems.
