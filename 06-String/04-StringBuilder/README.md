# StringBuilder in Java

StringBuilder is a mutable class used to create and modify strings efficiently.

---

## 📌 Key Points

* Mutable (can be changed)
* Not thread-safe
* Faster than String and StringBuffer
* Part of `java.lang` package

---

## 🔑 Why StringBuilder?

* String is immutable → creates new object every time
* StringBuilder modifies the same object → better performance

---

## ⚙️ Common Methods

* append()
* insert()
* replace()
* delete()
* reverse()
* capacity()

---

## 💡 Example

```java id="2shj9q"
StringBuilder sb = new StringBuilder("Java");
sb.append(" Programming");
```

---

## 🔥 Interview Questions

### 1. What is StringBuilder?

Mutable string class.

---

### 2. Why faster than String?

Because it does not create new objects.

---

### 3. Is it thread-safe?

No.

---

## 🚀 Summary

StringBuilder is used when frequent modifications are required, offering better performance than String.
