## 🔹 intern() Method

The `intern()` method is used to add a string to the **String Constant Pool (SCP)** or return the reference of an existing string from the pool.

---

### 📌 Syntax

```java
String s = str.intern();
```

---

### ⚙️ How intern() Works

* If the string already exists in SCP → returns reference of existing object
* If not present → adds it to SCP and returns reference

---

### 💡 Example

```java
String s1 = new String("Java");
String s2 = s1.intern();

String s3 = "Java";

System.out.println(s1 == s3); // false (heap vs SCP)
System.out.println(s2 == s3); // true (both in SCP)
```

---

### 🧠 Explanation

* `s1` → created in heap
* `s2` → points to SCP object
* `s3` → created in SCP

👉 After using `intern()`, both `s2` and `s3` refer to the **same object in SCP**

---

### 🔥 When to Use intern()

* To save memory when dealing with many duplicate strings
* To ensure reference equality for identical strings

---

### ⚠️ Important Points

* Works only with strings
* Helps in memory optimization
* Should not be overused unnecessarily

---

## 🚀 Summary

The `intern()` method ensures that duplicate strings share the same memory in the String Constant Pool, improving efficiency.
