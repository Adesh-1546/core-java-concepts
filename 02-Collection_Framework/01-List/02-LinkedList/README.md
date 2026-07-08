# LinkedList in Java

LinkedList is a class in the Java Collections Framework that implements the List interface using a doubly linked list.

---

## 🔑 Key Features

* Maintains insertion order
* Allows duplicate elements
* Not synchronized (not thread-safe)
* Uses nodes (not array) for storage
* Each node stores data + reference to next and previous node

---

## ⚙️ Internal Working

* Implemented as a **doubly linked list**
* Each element (node) contains:

  * Data
  * Reference to next node
  * Reference to previous node

---

## ⏱️ Time Complexity

| Operation           | Time Complexity           |
| ------------------- | ------------------------- |
| Add (beginning/end) | O(1)                      |
| Add (middle)        | O(n)                      |
| Get                 | O(n)                      |
| Set                 | O(n)                      |
| Remove              | O(1) (if reference known) |

---

## 💡 When to Use LinkedList

* When frequent insertion/deletion is required
* When working with dynamic data
* When shifting elements (like ArrayList) is costly

---

## ⚖️ LinkedList vs ArrayList

| Feature       | LinkedList         | ArrayList     |
| ------------- | ------------------ | ------------- |
| Structure     | Doubly Linked List | Dynamic Array |
| Access Time   | Slower (O(n))      | Faster (O(1)) |
| Insert/Delete | Faster             | Slower        |
| Memory        | More               | Less          |

---

## 🧠 Example Use Cases

* Queue implementation
* Frequent insert/delete operations
* Navigation systems (previous/next)

---

## ⚠️ Limitations

* Slow data access
* Higher memory usage
* Not suitable for frequent read operations

---

## 🚀 Summary

LinkedList is useful when frequent insertion and deletion operations are required. However, it is slower for accessing elements compared to ArrayList.
