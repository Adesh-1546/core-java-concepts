# Generics in Java

Generics allow us to write type-safe and reusable code by specifying the type of data a class, interface, or method can work with.

---

## 📌 Why Generics?

* Ensures type safety
* Eliminates runtime errors
* No need for explicit type casting
* Improves code readability

---

## 🔑 Syntax

```java
ClassName<Type> object = new ClassName<>();
```

---

## 💡 Example

```java
ArrayList<String> list = new ArrayList<>();
list.add("Adesh");
// list.add(10); // compile-time error
```

---

## ⚙️ Advantages

* Compile-time checking
* Avoids ClassCastException
* Reusable code

---

## 🔥 Interview Questions

### 1. What is Generics?

Generics provide type safety by allowing only specific types.

---

### 2. Why use Generics?

To avoid runtime errors and type casting.

---

### 3. What happens without Generics?

Mixed data types and runtime errors.

---

## 🚀 Summary

Generics make Java code safer, cleaner, and more reusable by enforcing type constraints at compile time.
