# Inheritance in Java

Inheritance is a mechanism in Java where one class (child/subclass) acquires the properties and behavior of another class (parent/superclass).

It helps in code reusability and establishes a relationship between classes.

---

## 🔑 Key Concepts

* Parent class → Superclass
* Child class → Subclass
* Achieved using the `extends` keyword
* Child class can access public and protected members of parent class

---

## 💡 Why Inheritance?

* Promotes code reusability
* Reduces code duplication
* Improves code organization
* Supports hierarchical classification

---

## 🧠 Real-Life Example

Animal → Dog

A dog inherits common properties like eating and sleeping from Animal, and also has its own behavior like barking.

---

## 📚 Types of Inheritance in Java

### 1. Single Inheritance

One child class inherits from one parent class.

```java id="d8g1vf"
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

### 2. Multilevel Inheritance

A class inherits from a class, which itself inherits from another class.

```java id="1x0p4l"
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
```

---

### 3. Hierarchical Inheritance

Multiple child classes inherit from a single parent class.

```java id="nqk4jh"
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
```

---

## ⚠️ Note

Java does NOT support multiple inheritance using classes to avoid ambiguity (diamond problem).
However, it can be achieved using interfaces.

---

## 📌 Advantages

* Code reuse
* Easy maintenance
* Better organization of classes
* Extensibility

---

## 🚀 Summary

Inheritance allows classes to reuse existing code and build relationships between them. It is widely used in real-world applications to create scalable and maintainable systems.

