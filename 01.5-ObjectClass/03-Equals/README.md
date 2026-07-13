# equals() Method in Java

The `equals()` method is used to compare two objects for equality.

---

## 📌 Default Behavior

By default, `equals()` compares object references (memory addresses).

```java
s1 == s2
```

---

## 🔑 Why Override equals()?

* To compare object content instead of reference
* Useful in real-world applications
* Required for collections like HashSet and HashMap

---

## ⚙️ Steps to Override equals()

1. Check if both references are same
2. Check if object is null or different class
3. Typecast object
4. Compare fields

---

## 💡 Example

```java
s1.equals(s2) → true (if values are same)
```

---

## 🔥 Interview Questions

### 1. What is equals() method?

Used to compare two objects.

---

### 2. Difference between == and equals()?

| ==                            | equals()         |
| ----------------------------- | ---------------- |
| Compares reference            | Compares content |
| Used for primitives & objects | Used for objects |

---

### 3. Why override equals()?

To compare object values instead of memory address.

---

### 4. What happens if not overridden?

Objects are compared based on memory reference.

---

## ⚠️ Important Points

* Must follow proper steps
* Should be consistent with hashCode()
* Avoid NullPointerException during comparison

---

## 🚀 Summary

The equals() method is used to compare object content. Overriding it allows meaningful comparison between objects.
