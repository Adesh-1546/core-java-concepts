# StringBuffer in Java

StringBuffer is a mutable class used to create and modify strings. It is thread-safe.

---

## 📌 Key Points

* Mutable
* Thread-safe (synchronized)
* Slower than StringBuilder
* Part of `java.lang` package

---

## 🔑 Why StringBuffer?

* Used in multi-threaded environments
* Ensures data consistency

---

## ⚙️ Common Methods

* append()
* insert()
* replace()
* delete()
* reverse()

---

## 💡 Example

```java id="z9gk1o"
StringBuffer sb = new StringBuffer("Java");
sb.append(" Programming");
```

---

## 🔥 Interview Questions

### 1. What is StringBuffer?

Mutable and thread-safe string class.

---

### 2. Difference between StringBuilder and StringBuffer?

StringBuilder is faster but not thread-safe, while StringBuffer is thread-safe but slower.

---

### 3. When to use StringBuffer?

In multi-threaded applications.

---

## 🚀 Summary

StringBuffer is used when thread safety is required while modifying strings.
