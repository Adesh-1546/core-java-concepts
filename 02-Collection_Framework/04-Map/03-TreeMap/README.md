# TreeMap in Java

TreeMap is a class in the Java Collections Framework that implements the Map interface and stores keys in sorted order.

---

## 🔑 Key Features

* Stores data as key-value pairs
* Keys are sorted (ascending by default)
* Does NOT allow null keys
* Allows multiple null values
* Slower than HashMap

---

## ⚙️ Internal Working

* Uses **Red-Black Tree** (self-balancing binary search tree)
* Sorting is based on:

  * `Comparable` (natural ordering)
  * `Comparator` (custom ordering)

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Put       | O(log n)        |
| Get       | O(log n)        |
| Remove    | O(log n)        |

---

## 💡 When to Use TreeMap

* When sorted keys are required
* When range-based operations are needed
* When ordered traversal is important

---

## ⚠️ Limitations

* Slower than HashMap
* Does not allow null keys
* No index-based access

---

## 🧠 Example Use Cases

* Ranking systems
* Sorted data storage
* Range queries

---

## 🔥 Interview Questions

### 1. Difference between HashMap and TreeMap?

| HashMap  | TreeMap     |
| -------- | ----------- |
| No order | Sorted keys |
| Faster   | Slower      |

---

### 2. How does TreeMap maintain sorting?

Using Red-Black Tree and compareTo()/Comparator.

---

### 3. Can TreeMap store null keys?

No, it throws NullPointerException.

---

### 4. What is the time complexity of TreeMap?

* Put → O(log n)
* Get → O(log n)
* Remove → O(log n)

---

### 5. When should we use TreeMap?

When sorted and ordered data is required.

---

### 6. Difference between Comparable and Comparator?

| Comparable   | Comparator    |
| ------------ | ------------- |
| Inside class | Outside class |
| compareTo()  | compare()     |

---

## 🚀 Summary

TreeMap is used when sorted keys are required. It provides ordering but is slower compared to HashMap.
