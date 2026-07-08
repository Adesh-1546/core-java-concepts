# LinkedHashMap in Java

LinkedHashMap is a class in the Java Collections Framework that implements the Map interface and maintains insertion order.

---

## 🔑 Key Features

* Stores data as key-value pairs
* Maintains insertion order
* Allows one null key and multiple null values
* Not thread-safe
* Slightly slower than HashMap

---

## ⚙️ Internal Working

* Uses **HashMap + Doubly Linked List**
* HashMap → for fast access
* Linked List → for maintaining order

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Put       | O(1)            |
| Get       | O(1)            |
| Remove    | O(1)            |

---

## 💡 When to Use LinkedHashMap

* When insertion order is important
* When predictable iteration order is required
* When HashMap is not enough due to unordered data

---

## ⚠️ Limitations

* Slightly slower than HashMap
* Uses more memory
* Not thread-safe

---

## 🧠 Example Use Cases

* Caching systems
* Maintaining ordered data
* LRU Cache (with access-order)

---

## 🔥 Interview Questions

### 1. Difference between HashMap and LinkedHashMap?

| HashMap  | LinkedHashMap             |
| -------- | ------------------------- |
| No order | Maintains insertion order |
| Faster   | Slightly slower           |

---

### 2. How does LinkedHashMap maintain order?

Using a doubly linked list along with hashing.

---

### 3. Can LinkedHashMap store null?

Yes, one null key and multiple null values.

---

### 4. What is access-order in LinkedHashMap?

It maintains order based on access (used in LRU cache).

---

### 5. What is the time complexity?

* Put → O(1)
* Get → O(1)
* Remove → O(1)

---

### 6. When should we use LinkedHashMap?

When order of insertion is important.

---

## 🚀 Summary

LinkedHashMap is useful when both fast performance and insertion order are required. It is widely used in caching and ordered data storage.
