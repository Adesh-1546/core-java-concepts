# LinkedHashSet in Java

LinkedHashSet is a class in the Java Collections Framework that implements the Set interface and maintains insertion order while storing unique elements.

---

## 🔑 Key Features

* Does NOT allow duplicate elements
* Maintains insertion order
* Allows one null value
* Not index-based
* Slightly slower than HashSet

---

## ⚙️ Internal Working

* Uses **HashMap + Linked List** internally
* Maintains a doubly linked list to preserve order
* Uses:

  * `hashCode()` → to locate bucket
  * `equals()` → to check duplicates

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1)            |
| Remove    | O(1)            |
| Contains  | O(1)            |

---

## 💡 When to Use LinkedHashSet

* When duplicates are NOT allowed
* When insertion order must be preserved
* When predictable iteration order is needed

---

## ⚠️ Limitations

* Slightly slower than HashSet
* No index-based access
* Uses more memory due to linked structure

---

## 🧠 Example Use Cases

* Maintaining ordered unique elements
* Removing duplicates while preserving order
* Caching systems where order matters

---

## 🔥 Interview Questions

### 1. Difference between HashSet and LinkedHashSet?

| HashSet      | LinkedHashSet              |
| ------------ | -------------------------- |
| No order     | Maintains insertion order  |
| Faster       | Slightly slower            |
| Uses HashMap | Uses HashMap + Linked List |

---

### 2. How does LinkedHashSet maintain order?

It uses a doubly linked list along with hashing.

---

### 3. Does LinkedHashSet allow duplicates?

No, duplicates are not allowed.

---

### 4. Can LinkedHashSet store null?

Yes, only one null value is allowed.

---

### 5. When should we use LinkedHashSet over HashSet?

When order of insertion is important.

---

### 6. What is the time complexity of LinkedHashSet?

* Add → O(1)
* Remove → O(1)
* Contains → O(1)

---

## 🚀 Summary

LinkedHashSet is useful when you need both uniqueness and insertion order. It provides predictable iteration order while maintaining good performance.
