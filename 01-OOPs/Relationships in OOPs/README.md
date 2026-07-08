# Relationship in OOP (IS-A and HAS-A)

In Object-Oriented Programming, relationships define how classes are connected with each other.

---

## 🔹 IS-A Relationship (Inheritance)

IS-A represents inheritance.

* One class is a type of another class
* Achieved using `extends` keyword
* Promotes code reusability

### Example

Dog IS-A Animal

---

## 🔹 HAS-A Relationship (Composition)

HAS-A represents composition.

* One class contains another class
* Achieved using object reference
* Promotes code reuse and flexibility

### Example

Car HAS-A Engine

---

## ⚖️ Difference between IS-A and HAS-A

| Feature      | IS-A                | HAS-A               |
| ------------ | ------------------- | ------------------- |
| Relationship | Inheritance         | Composition         |
| Keyword      | extends             | object reference    |
| Coupling     | Tight               | Loose               |
| Reusability  | Through inheritance | Through composition |

---

## 💡 When to Use

* Use IS-A → when there is a clear parent-child relationship
* Use HAS-A → when functionality is required without inheritance

---

## 🧠 Real World Examples

* Dog IS-A Animal
* Car HAS-A Engine
* Student HAS-A Address

---

## 🔥 Interview Questions

### 1. What is IS-A relationship?

Inheritance relationship between classes.

---

### 2. What is HAS-A relationship?

Composition where one class contains another.

---

### 3. Which is better: IS-A or HAS-A?

HAS-A is preferred for flexibility and loose coupling.

---

## 🚀 Summary

IS-A represents inheritance, while HAS-A represents composition. Both are important for designing flexible and reusable systems.
