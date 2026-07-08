# Queue Interface in Java

The Queue interface in Java is a part of the Collections Framework and represents a collection designed for holding elements prior to processing.

It typically follows the FIFO (First In First Out) principle.

---

## 🔑 Key Characteristics

* Follows FIFO (First In First Out)
* Elements are inserted at the rear and removed from the front
* Does not allow null elements (in most implementations)
* Not index-based

---

## 📚 Common Implementations

### 1. PriorityQueue

* Elements are ordered based on priority
* Does not follow strict FIFO
* Default is natural sorting (min-heap)

---

### 2. ArrayDeque (Recommended)

* Faster than Stack and LinkedList
* Can be used as Queue or Stack
* Not thread-safe

---

### 3. LinkedList

* Can also implement Queue
* Supports FIFO operations

---

## ⚙️ Important Methods

| Method             | Description        |
| ------------------ | ------------------ |
| add() / offer()    | Insert element     |
| remove() / poll()  | Remove element     |
| element() / peek() | View front element |

---

## ⚠️ Difference Between Methods

| Method    | Throws Exception | Returns Value |
| --------- | ---------------- | ------------- |
| add()     | Yes              | —             |
| offer()   | No               | false         |
| remove()  | Yes              | —             |
| poll()    | No               | null          |
| element() | Yes              | —             |
| peek()    | No               | null          |

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1)            |
| Remove    | O(1)            |
| Peek      | O(1)            |

---

## 💡 When to Use Queue

* Task scheduling
* Order processing
* Handling requests (like server queues)
* Breadth-First Search (BFS)

---

## 🧠 Example Use Cases

* Printer queue
* Call center system
* Job scheduling systems

---

## 🔥 Interview Questions

### 1. What is Queue?

A data structure that follows FIFO (First In First Out).

---

### 2. Difference between add() and offer()?

* add() throws exception if fails
* offer() returns false

---

### 3. Difference between remove() and poll()?

* remove() throws exception
* poll() returns null

---

### 4. What is PriorityQueue?

A queue where elements are processed based on priority instead of FIFO.

---

### 5. Why is ArrayDeque preferred over Stack?

Because it is faster and not synchronized.

---

## 🚀 Summary

Queue is used when elements need to be processed in order. It is widely used in scheduling, buffering, and real-time systems.
