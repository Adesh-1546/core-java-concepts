# Vector in Java

Vector is a class in the Java Collections Framework that implements the List interface. It is similar to ArrayList but is synchronized, making it thread-safe.

---

## 🔑 Key Features

* Maintains insertion order
* Allows duplicate elements
* Thread-safe (synchronized)
* Dynamic resizing
* Legacy class (introduced in early Java versions)

---

## ⚙️ Internal Working

* Uses a dynamic array internally
* Automatically resizes when capacity is full
* All methods are synchronized (thread-safe)

---

## ⏱️ Time Complexity

| Operation | Time Complexity  |
| --------- | ---------------- |
| Add (end) | O(1) (amortized) |
| Get       | O(1)             |
| Set       | O(1)             |
| Remove    | O(n)             |

---

## ⚖️ Vector vs ArrayList

| Feature         | Vector        | ArrayList   |
| --------------- | ------------- | ----------- |
| Thread-safe     | ✅ Yes         | ❌ No        |
| Performance     | Slower        | Faster      |
| Synchronization | Yes           | No          |
| Usage           | Rare (legacy) | Widely used |

---

## 💡 When to Use Vector

* When thread safety is required
* In multi-threaded environments (rare today)
* When working with legacy systems

---

## ⚠️ Limitations

* Slower due to synchronization overhead
* Rarely used in modern applications
* Better alternatives:

  * ArrayList + Collections.synchronizedList()
  * CopyOnWriteArrayList

---

## 🧠 Example Use Cases

* Multi-threaded applications (legacy)
* Systems requiring synchronized list operations

---

## 🚀 Summary

Vector is a thread-safe dynamic array but is rarely used in modern Java development due to performance overhead. ArrayList is preferred in most cases.
