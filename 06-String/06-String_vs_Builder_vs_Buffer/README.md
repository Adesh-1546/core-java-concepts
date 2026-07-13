# String vs StringBuilder vs StringBuffer

These three classes are used to handle strings in Java, but they differ in mutability, performance, and thread safety.

---

## ⚖️ Comparison Table

| Feature       | String                      | StringBuilder | StringBuffer     |
| ------------- | --------------------------- | ------------- | ---------------- |
| Mutability    | Immutable ❌                 | Mutable ✔     | Mutable ✔        |
| Thread Safety | ❌                           | ❌             | ✔ (Synchronized) |
| Performance   | Slow                        | Fast          | Medium           |
| Memory Usage  | More (new object each time) | Less          | Less             |
| Package       | java.lang                   | java.lang     | java.lang        |

---

## 🔑 Key Differences

### 🔹 String

* Immutable (cannot be changed)
* Every modification creates a new object
* Uses String Constant Pool

---

### 🔹 StringBuilder

* Mutable (can be modified)
* Faster than String
* Not thread-safe
* Best for single-threaded environments

---

### 🔹 StringBuffer

* Mutable
* Thread-safe (synchronized methods)
* Slower than StringBuilder
* Used in multi-threaded environments

---

## 💡 Example

```java id="cmp12x"
String s = "Java";
s.concat(" Programming"); // new object created

StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming"); // same object modified
```

---

## 🔥 When to Use What?

* Use **String** → when data is constant
* Use **StringBuilder** → when frequent modifications are required
* Use **StringBuffer** → when thread safety is required

---

## 🔥 Interview Questions

### 1. Which is fastest?

StringBuilder

---

### 2. Which is thread-safe?

StringBuffer

---

### 3. Why is String slow?

Because it creates new objects due to immutability.

---

### 4. Can StringBuilder be used in multithreading?

Yes, but not safe without synchronization.

---

## ⚠️ Important Points

* Prefer StringBuilder in most cases
* Avoid String for heavy modifications
* Use StringBuffer only when thread safety is needed

---

## 🚀 Summary

String is immutable and safe, while StringBuilder and StringBuffer are mutable. StringBuilder is fast and efficient, whereas StringBuffer provides thread safety.
