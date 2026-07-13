# Object Class in Java

The `Object` class is the root class of the Java class hierarchy. Every class in Java directly or indirectly inherits from the Object class.

---

## 📌 Key Points

* Present in `java.lang` package
* Parent of all classes in Java
* Provides common methods for all objects
* No need to import explicitly

---

## 🔑 Why Object Class is Important?

* Enables code reusability
* Provides default behavior for all objects
* Allows common methods like comparison, printing, and hashing

---

## ⚙️ Important Methods of Object Class

| Method     | Description                             |
| ---------- | --------------------------------------- |
| toString() | Returns string representation of object |
| equals()   | Compares two objects                    |
| hashCode() | Returns hash value                      |
| getClass() | Returns class information               |
| clone()    | Creates object copy                     |
| finalize() | Called before garbage collection        |

---

## 💡 Example

```java id="u7e9nm"
class Student {
    int id;
    String name;
}
```

Every class like `Student` automatically extends Object.

---

## 🔥 Interview Questions

### 1. What is Object class?

Root class of all Java classes.

---

### 2. Do all classes inherit Object?

Yes, directly or indirectly.

---

### 3. Which package contains Object class?

java.lang

---

### 4. Why is Object class important?

Provides common methods for all objects.

---

## ⚠️ Important Points

* Every object can access Object class methods
* No class can exist without extending Object
* Methods like toString(), equals(), hashCode() are widely used

---

## 🚀 Summary

The Object class is the foundation of Java. It provides essential methods that are used by all objects, making it a core part of Java programming.
