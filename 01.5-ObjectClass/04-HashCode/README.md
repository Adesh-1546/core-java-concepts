# hashCode() Method in Java

The `hashCode()` method returns an integer value that represents the hash value of an object.

---

## 📌 Default Behavior

* Returns a unique number based on memory address
* Different objects → different hashcodes

---

## 🔑 Why Override hashCode()?

* Required when equals() is overridden
* Used in hash-based collections like:

  * HashMap
  * HashSet

---

## ⚙️ How hashCode Works

* Objects are stored in buckets
* hashCode decides bucket location
* equals() is used to compare objects inside bucket

---

## 💡 Example

```java id="1clcxp"
Two equal objects → same hashCode
```

---

## 🔥 Interview Questions

### 1. What is hashCode()?

Returns hash value of object.

---

### 2. Why override hashCode()?

To maintain consistency with equals().

---

### 3. Where is hashCode used?

HashMap, HashSet, Hashtable.

---

## ⚠️ Important Rule

If two objects are equal → they must have same hashCode.

---

## 🚀 Summary

hashCode() is used to improve performance of collections by reducing search space.
