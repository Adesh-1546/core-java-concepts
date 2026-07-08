# PriorityQueue in Java

PriorityQueue is a class in the Java Collections Framework that implements the Queue interface. It processes elements based on priority rather than insertion order.

---

## 🔑 Key Features

* Does NOT follow FIFO strictly
* Elements are ordered based on priority
* Default behavior → Min Heap (smallest element first)
* Does not allow null elements
* Not thread-safe

---

## ⚙️ Internal Working

* Uses a **Heap Data Structure** (Binary Heap)
* Default is **Min Heap**
* Ordering is based on:

  * Natural ordering (Comparable)
  * Custom Comparator

---

## ⏱️ Time Complexity

| Operation     | Time Complexity |
| ------------- | --------------- |
| Add           | O(log n)        |
| Remove (poll) | O(log n)        |
| Peek          | O(1)            |

---

## 💡 When to Use PriorityQueue

* When elements must be processed based on priority
* Task scheduling systems
* Dijkstra’s algorithm
* Job scheduling

---

## ⚠️ Important Notes

* Does not maintain sorted order during iteration
* Only the head element is guaranteed to be smallest
* Internal structure may look unordered

---

## 🧠 Example Use Cases

* CPU scheduling
* Task prioritization
* Graph algorithms

---

## 🔥 Interview Questions

### 1. Does PriorityQueue follow FIFO?

No, it processes elements based on priority.

---

### 2. What is the default behavior of PriorityQueue?

Min-Heap (smallest element has highest priority).

---

### 3. Can we create Max-Heap?

Yes, using Comparator.

---

### 4. Why does PriorityQueue look unordered when printed?

Because only the head is guaranteed to be smallest; internal structure is heap-based.

---

### 5. Can PriorityQueue store null?

No, it throws NullPointerException.

---

### 6. What is the time complexity?

* Add → O(log n)
* Poll → O(log n)
* Peek → O(1)

---

## 🚀 Summary

PriorityQueue is used when elements need to be processed based on priority instead of order. It is widely used in scheduling and algorithm-based problems.
