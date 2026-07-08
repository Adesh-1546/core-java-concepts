
# ArrayList in Java

ArrayList is a class in the Java Collections Framework that implements the List interface. It is a dynamic array that can grow and shrink in size automatically.

---

## 🔑 Key Features

* Maintains insertion order
* Allows duplicate elements
* Provides index-based access
* Dynamic resizing (no fixed size)
* Not synchronized (not thread-safe)

---

## ⚙️ Internal Working

* Uses a resizable array internally
* When capacity is full, a new larger array is created
* Old elements are copied to the new array

---

## ⏱️ Time Complexity

| Operation    | Time Complexity  |
| ------------ | ---------------- |
| Add (end)    | O(1) (amortized) |
| Add (middle) | O(n)             |
| Get          | O(1)             |
| Set          | O(1)             |
| Remove       | O(n)             |

---

## 💡 When to Use ArrayList

* When fast access (read operations) is required
* When insertion/deletion is mostly at the end
* When order of elements matters
* When duplicates are allowed

---

## ⚠️ Limitations

* Slow insertion/deletion in middle (shifting required)
* Not thread-safe
* Resizing may cause performance overhead

---

## 🧠 Example Use Cases

* Storing list of users
* Product lists in e-commerce
* Managing dynamic data collections

---

## 🚀 Summary

ArrayList is one of the most commonly used classes in Java for storing and managing dynamic data efficiently. It provides fast access and is best suited for scenarios where frequent reading operations are required.
