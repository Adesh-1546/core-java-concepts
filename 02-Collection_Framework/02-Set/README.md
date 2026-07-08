# Set Interface in Java

The Set interface in Java is a part of the Collections Framework that represents a collection of unique elements.

It does not allow duplicate values and does not guarantee insertion order (in most implementations).

---

## 🔑 Key Characteristics

* Does NOT allow duplicate elements
* Does not maintain insertion order (HashSet)
* Allows at most one null element (HashSet)
* Not index-based
* Uses hashing internally (in most implementations)

---

## 📚 Common Implementations

### 1. HashSet

* Uses hash table internally
* No duplicate elements allowed
* Does not maintain order
* Fast performance

---

### 2. LinkedHashSet

* Maintains insertion order
* Slightly slower than HashSet
* Uses hash table + linked list

---

### 3. TreeSet (Optional)

* Stores elements in sorted order
* Uses Red-Black Tree internally
* Does not allow null values

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1) (HashSet)  |
| Remove    | O(1)            |
| Contains  | O(1)            |

(TreeSet operations are O(log n))

---

## 💡 When to Use Set

* When duplicates are NOT allowed
* When uniqueness of data is important
* When fast search operations are required

---

## ⚖️ Set vs List

| Feature    | Set              | List          |
| ---------- | ---------------- | ------------- |
| Duplicates | ❌ Not allowed    | ✅ Allowed     |
| Order      | ❌ Not guaranteed | ✅ Maintained  |
| Access     | ❌ No index       | ✅ Index-based |

---

## 🧠 Example Use Cases

* Storing unique user IDs
* Removing duplicates from data
* Maintaining unique elements in a system

---

## ⚠️ Limitations

* No index-based access
* Order not guaranteed (HashSet)
* Cannot store duplicate values

---

## 🚀 Summary

The Set interface is used when uniqueness is required. HashSet is the most commonly used implementation due to its fast performance.
