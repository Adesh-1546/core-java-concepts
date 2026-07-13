# String Basics in Java

A String in Java is an object that represents a sequence of characters.

---

## 📌 Key Points

* Strings are immutable
* Stored in String Constant Pool (SCP)
* Belong to `java.lang` package

---

## 🔑 String Constant Pool (SCP)

The **String Constant Pool** is a special memory area inside the heap where Java stores string literals.

### 📌 Why SCP is used?

* To **avoid duplicate objects**
* To **save memory**
* To improve performance

---

## ⚙️ How Object Creation Works in SCP

### 🔹 Case 1: Using String Literal

```java
String s1 = "Java";
String s2 = "Java";
```

### 👉 What happens internally?

* JVM checks SCP
* If `"Java"` is already present → reuse it
* No new object is created

### 💡 Result

```java
s1 == s2  → true
```

👉 Both references point to **same object in SCP**

---

### 🔹 Case 2: Using new Keyword

```java
String s3 = new String("Java");
```

### 👉 What happens internally?

* JVM checks SCP:

  * If `"Java"` not present → creates it in SCP
* Then **creates a new object in Heap memory**

### 💡 Result

```java
s1 == s3 → false
```

👉 Because:

* `s1` → SCP
* `s3` → Heap

---

### 🔹 Visual Understanding

```text
String Pool (SCP)         Heap
------------------        ------------------
"Java"  ← s1, s2          new String("Java") ← s3
```

---

## 🔄 Important Concept: Immutability + SCP

* Strings cannot be modified
* Any change creates a **new object**
* Old object remains in SCP

---

## 🔥 Interview Questions

### 1. What is String Constant Pool?

Special memory area to store string literals.

---

### 2. Why SCP is used?

To reduce memory usage and improve performance.

---

### 3. Difference between literal and new String?

| Literal       | new String                |
| ------------- | ------------------------- |
| Stored in SCP | Stored in Heap            |
| Reuses object | Always creates new object |

---

### 4. Why s1 == s2 is true?

Because both point to same object in SCP.

---

## ⚠️ Important Points

* SCP avoids duplicate strings
* new keyword always creates new object
* == compares reference, not content

---

## 🚀 Summary

The String Constant Pool is an optimized memory area that stores string literals and prevents duplicate objects, improving performance and memory usage.
