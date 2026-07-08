# Map Interface in Java

The Map interface in Java is part of the Collections Framework and is used to store data in key-value pairs.

Each key maps to a specific value, and keys must be unique.

---

## 🔑 Key Characteristics

* Stores data as **key-value pairs**
* Keys must be unique
* Values can be duplicated
* Not a part of Collection interface
* Not index-based

---

## 📚 Common Implementations

### 1. HashMap

* Most commonly used
* No order maintained
* Allows one null key and multiple null values
* Fast performance

---

### 2. LinkedHashMap

* Maintains insertion order
* Slightly slower than HashMap

---

### 3. TreeMap

* Stores keys in sorted order
* Does not allow null keys
* Slower than HashMap

---

## ⚙️ Important Methods

| Method          | Description           |
| --------------- | --------------------- |
| put()           | Insert key-value pair |
| get()           | Retrieve value by key |
| remove()        | Remove key-value pair |
| containsKey()   | Check if key exists   |
| containsValue() | Check if value exists |
| keySet()        | Returns all keys      |
| values()        | Returns all values    |

---

## ⏱️ Time Complexity

| Operation | HashMap | TreeMap  |
| --------- | ------- | -------- |
| Put       | O(1)    | O(log n) |
| Get       | O(1)    | O(log n) |
| Remove    | O(1)    | O(log n) |

---

## 💡 When to Use Map

* When data is stored in key-value format
* When fast lookup is required
* When unique keys are needed

---

## ⚖️ Map vs Collection

| Feature        | Map           | Collection    |
| -------------- | ------------- | ------------- |
| Data           | Key-Value     | Single value  |
| Duplicate Keys | ❌ Not allowed | —             |
| Structure      | Pair-based    | Element-based |

---

## 🧠 Example Use Cases

* Storing user data (ID → Name)
* Caching systems
* Database-like structures

---

## 🔥 Interview Questions

### 1. Why Map is not part of Collection interface?

Because it stores key-value pairs instead of single elements.

---

### 2. Difference between HashMap and TreeMap?

| HashMap  | TreeMap |
| -------- | ------- |
| No order | Sorted  |
| Faster   | Slower  |

---

### 3. Can Map have duplicate keys?

No, keys must be unique.

---

### 4. Can Map have duplicate values?

Yes.

---

### 5. Which Map is fastest?

HashMap.

---

### 6. Can HashMap have null?

Yes, one null key and multiple null values.

---

## 🚀 Summary

Map is used to store key-value pairs efficiently. HashMap is the most commonly used implementation due to its fast performance.
