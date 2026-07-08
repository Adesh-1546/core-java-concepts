# TreeSet in Java

TreeSet is a class in the Java Collections Framework that implements the Set interface and stores elements in sorted order.

---

## 🔑 Key Features

* Does NOT allow duplicate elements
* Stores elements in sorted (ascending) order
* Does NOT allow null values
* Not index-based
* Slower than HashSet and LinkedHashSet

---

## ⚙️ Internal Working

* Uses **Red-Black Tree** (self-balancing binary search tree)
* Elements are automatically sorted
* Uses:

  * `compareTo()` (for natural ordering)
  * `Comparator` (for custom sorting)

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(log n)        |
| Remove    | O(log n)        |
| Contains  | O(log n)        |

---

## 💡 When to Use TreeSet

* When sorted data is required
* When duplicates are not allowed
* When frequent searching in sorted order is needed

---

## ⚠️ Limitations

* Slower than HashSet
* Does not allow null values
* No index-based access

---

## 🧠 Example Use Cases

* Storing sorted data
* Ranking systems
* Maintaining unique sorted elements

---

## 🔥 Interview Questions

### 1. Difference between HashSet, LinkedHashSet, and TreeSet?

| Feature     | HashSet    | LinkedHashSet      | TreeSet        |
| ----------- | ---------- | ------------------ | -------------- |
| Order       | No         | Insertion order    | Sorted order   |
| Performance | Fastest    | Slightly slower    | Slowest        |
| Structure   | Hash Table | Hash + Linked List | Red-Black Tree |

---

### 2. How does TreeSet maintain sorting?

It uses a Red-Black Tree and compares elements using compareTo() or Comparator.

---

### 3. Can TreeSet store null?

No, it throws NullPointerException.

---

### 4. What is the difference between compareTo() and Comparator?

* compareTo() → natural sorting
* Comparator → custom sorting

---

### 5. What is the time complexity of TreeSet?

* Add → O(log n)
* Remove → O(log n)
* Contains → O(log n)

---

### 6. When should we use TreeSet?

When sorted and unique data is required.

---

## 🚀 Summary

TreeSet is used when you need sorted and unique elements. It provides ordering but at the cost of performance compared to HashSet.
