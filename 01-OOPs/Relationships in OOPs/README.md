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

HAS-A represents a relationship where one class contains another class.

* Achieved using object reference
* Promotes code reuse and flexibility

---

## 🔸 Types of HAS-A Relationship

### 1. Composition (Strong Association)

* Strong relationship
* Dependent objects (child cannot exist without parent)
* If parent is destroyed → child is also destroyed

#### Example:

House HAS-A Room
If House is destroyed → Rooms also destroyed

---

### 2. Aggregation (Weak Association)

* Weak relationship
* Independent objects
* Child can exist without parent

#### Example:

College HAS-A Student
If College is closed → Students still exist

---

## ⚖️ Difference between IS-A and HAS-A

| Feature      | IS-A                | HAS-A               |
| ------------ | ------------------- | ------------------- |
| Relationship | Inheritance         | Composition         |
| Keyword      | extends             | object reference    |
| Coupling     | Tight               | Loose               |
| Reusability  | Through inheritance | Through composition |

---

## ⚖️ Composition vs Aggregation

| Feature    | Composition    | Aggregation        |
| ---------- | -------------- | ------------------ |
| Strength   | Strong         | Weak               |
| Dependency | Dependent      | Independent        |
| Lifecycle  | Same lifecycle | Separate lifecycle |

---

## 💡 When to Use

* Use IS-A → when there is a clear parent-child relationship
* Use HAS-A → when functionality is needed without inheritance
* Use Composition → when objects are tightly related
* Use Aggregation → when objects are loosely related

---

## 🧠 Real World Examples

* Dog IS-A Animal
* Car HAS-A Engine
* House HAS-A Room (Composition)
* College HAS-A Student (Aggregation)

---

## 🔥 Interview Questions

### 1. What is IS-A relationship?

Inheritance relationship between classes.

---

### 2. What is HAS-A relationship?

Composition where one class contains another.

---

### 3. What are types of HAS-A?

* Composition
* Aggregation

---

### 4. Difference between Composition and Aggregation?

Composition is strong dependency, aggregation is weak.

---

### 5. Which is better: IS-A or HAS-A?

HAS-A is preferred for flexibility and loose coupling.

---

## 🚀 Summary

IS-A represents inheritance, while HAS-A represents composition and aggregation. These relationships help design flexible and reusable systems.
