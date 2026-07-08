# List Interface in Java

The List interface in Java is a part of the Collections Framework and represents an ordered collection of elements.

It allows duplicate elements and maintains insertion order.

---

## 🔑 Key Characteristics

* Ordered collection (maintains insertion order)
* Allows duplicate elements
* Supports index-based access
* Dynamic in size

---

## 📚 Common Implementations

### 1. ArrayList

* Uses dynamic array internally
* Fast for data retrieval (get operation)
* Slower for insertion/deletion in middle

---

### 2. LinkedList

* Uses doubly linked list
* Faster insertion and deletion
* Slower access compared to ArrayList

---

### 3. Vector

* Similar to ArrayList
* Synchronized (thread-safe)
* Slower performance compared to ArrayList
* Legacy class (rarely used in modern applications)

---

### 4. Stack

* Extends Vector
* Follows **LIFO (Last In First Out)** principle
* Common operations:

  * `push()`
  * `pop()`
  * `peek()`

---

## ⚖️ ArrayList vs LinkedList vs Vector vs Stack

| Feature     | ArrayList     | LinkedList             | Vector             | Stack           |
| ----------- | ------------- | ---------------------- | ------------------ | --------------- |
| Structure   | Dynamic Array | Linked List            | Dynamic Array      | Vector-based    |
| Thread-safe | ❌ No          | ❌ No                   | ✅ Yes              | ✅ Yes           |
| Performance | Fast          | Moderate               | Slower             | Slower          |
| Special Use | General use   | Frequent insert/delete | Legacy thread-safe | LIFO operations |

---

## 💡 When to Use List

* When order of elements matters
* When duplicates are allowed
* When you need index-based access
* When working with dynamic data

---

## 🧠 Example Use Cases

* Storing student records
* Maintaining ordered logs
* Undo/Redo operations (Stack)
* Managing items in a cart

---

## 🚀 Summary

The List interface is widely used in Java for storing ordered collections of data.
ArrayList is the most commonly used implementation, while LinkedList, Vector, and Stack are used in specific scenarios.
