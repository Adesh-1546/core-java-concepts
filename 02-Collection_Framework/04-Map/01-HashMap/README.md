# HashMap in Java

HashMap is a class in the Java Collections Framework that implements the Map interface. It stores data in key-value pairs and provides fast performance.

---

## 🔑 Key Features

* Stores data as key-value pairs
* Keys must be unique
* Allows one null key and multiple null values
* Does not maintain order
* Not thread-safe

---

## ⚙️ Internal Working

* Uses **Hash Table** internally
* Each entry is stored in a bucket
* Uses:

  * `hashCode()` → to find bucket
  * `equals()` → to check key equality

---

## ⚠️ Collision Handling

When two keys have same hashCode:

* Stored in same bucket
* Uses:

  * Linked List (before Java 8)
  * Balanced Tree (after Java 8, if many collisions)

---

## 📊 Load Factor & Capacity

* Default capacity = 16
* Load factor = 0.75

👉 When threshold exceeded → resizing happens

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Put       | O(1)            |
| Get       | O(1)            |
| Remove    | O(1)            |

(Worst case → O(n))

---

## 💡 When to Use HashMap

* Fast lookup required
* Key-value data storage
* Caching systems
* Database-like structures

---

## ⚖️ HashMap vs Hashtable

| HashMap          | Hashtable           |
| ---------------- | ------------------- |
| Not synchronized | Synchronized        |
| Faster           | Slower              |
| Allows null      | Does not allow null |

---

## 🧠 Example Use Cases

* Storing user data
* Counting frequency of elements
* Caching

---

## 🔥 Interview Questions

### 1. How does HashMap work internally?

Uses hashCode() to find bucket and equals() to check key uniqueness.

---

### 2. What is hashCode()?

A method that returns an integer hash value for an object.

---

### 3. What is collision?

When two keys map to same bucket.

---

### 4. How is collision handled?

Using LinkedList or Tree (Java 8+).

---

### 5. What is load factor?

Threshold to decide when resizing happens.

---

### 6. Why HashMap is not thread-safe?

Because methods are not synchronized.

---

### 7. Can HashMap have null?

Yes, one null key and multiple null values.

---

### 8. Difference between HashMap and LinkedHashMap?

| HashMap  | LinkedHashMap             |
| -------- | ------------------------- |
| No order | Maintains insertion order |

---

## 🚀 Summary

HashMap is the most commonly used Map implementation. It provides fast operations using hashing and is widely used in real-world applications.
