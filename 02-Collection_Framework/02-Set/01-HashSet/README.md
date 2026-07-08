# HashSet in Java

HashSet is a class in the Java Collections Framework that implements the Set interface. It is used to store unique elements and does not allow duplicates.

---

## 🔑 Key Features

* Does NOT allow duplicate elements
* Does not maintain insertion order
* Allows one null value
* Not index-based
* Fast performance using hashing

---

## ⚙️ Internal Working

* HashSet uses a **HashMap internally**
* Elements are stored as keys in HashMap
* Uses:

  * `hashCode()` → to find bucket
  * `equals()` → to check duplicates

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1)            |
| Remove    | O(1)            |
| Contains  | O(1)            |

---

## 💡 When to Use HashSet

* When duplicates are NOT allowed
* When order is not important
* When fast search operations are required

---

## ⚠️ Limitations

* Does not maintain order
* No index-based access
* Only one null value allowed

---

## 🧠 Example Use Cases

* Removing duplicates from list
* Storing unique user IDs
* Checking existence of elements quickly

---

## 🔥 Interview Questions

### 1. Why does HashSet not allow duplicates?

Because it uses `hashCode()` and `equals()` to identify unique elements.

---

### 2. How does HashSet work internally?

It uses HashMap internally where elements are stored as keys.

---

### 3. What is hashing?

Hashing is a technique to convert data into a unique hash value for fast access.

---

### 4. What happens if two objects have same hashCode?

Collision occurs, and equals() is used to check uniqueness.

---

### 5. Can HashSet store null?

Yes, but only one null value.

---

### 6. Difference between HashSet and LinkedHashSet?

| HashSet  | LinkedHashSet             |
| -------- | ------------------------- |
| No order | Maintains insertion order |
| Faster   | Slightly slower           |

---

## 🚀 Summary

HashSet is one of the most commonly used collections in Java for storing unique elements efficiently. It provides fast operations and is widely used when order is not important.
