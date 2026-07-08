# ArrayDeque in Java

ArrayDeque is a class in the Java Collections Framework that implements the Deque interface. It allows insertion and removal of elements from both ends.

---

## 🔑 Key Features

* Double-ended queue (Deque)
* Can act as Queue (FIFO) and Stack (LIFO)
* Faster than Stack and LinkedList
* Does NOT allow null elements
* Not thread-safe

---

## ⚙️ Internal Working

* Uses a dynamic circular array
* Supports operations at both ends efficiently
* No capacity restrictions (resizes automatically)

---

## ⏱️ Time Complexity

| Operation         | Time Complexity |
| ----------------- | --------------- |
| Add First/Last    | O(1)            |
| Remove First/Last | O(1)            |
| Peek              | O(1)            |

---

## 💡 When to Use ArrayDeque

* When you need both stack and queue operations
* When high performance is required
* When working with LIFO or FIFO logic

---

## ⚠️ Limitations

* Does not allow null elements
* Not thread-safe
* No index-based access

---

## 🧠 Example Use Cases

* Implementing stack operations
* Sliding window problems
* Task scheduling
* Undo/Redo operations

---

## 🔥 Interview Questions

### 1. What is ArrayDeque?

A resizable array-based implementation of Deque.

---

### 2. Why is ArrayDeque preferred over Stack?

Because it is faster and not synchronized.

---

### 3. Can ArrayDeque be used as both Stack and Queue?

Yes, it supports both LIFO and FIFO operations.

---

### 4. Does ArrayDeque allow null?

No, it throws NullPointerException.

---

### 5. What is the time complexity?

All major operations are O(1).

---

### 6. Difference between ArrayDeque and LinkedList?

| ArrayDeque      | LinkedList  |
| --------------- | ----------- |
| Faster          | Slower      |
| Array-based     | Node-based  |
| No null allowed | Allows null |

---

## 🚀 Summary

ArrayDeque is a high-performance alternative to Stack and LinkedList. It is widely used for both queue and stack operations in modern Java applications.
