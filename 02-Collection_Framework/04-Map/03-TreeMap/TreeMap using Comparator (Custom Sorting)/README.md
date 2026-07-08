# TreeMap Sorting using Comparator

Comparator is used to define custom sorting logic outside the class.

---

## 🔑 Key Points

* Present in `java.util`
* Used for custom sorting
* Multiple sorting logics possible
* Uses `compare()`

---

## ⚙️ How it Works in TreeMap

* Comparator is passed to TreeMap
* Sorting is based on `compare()` method

---

## 🔥 Interview Questions

### 1. What is Comparator?

An interface used for custom sorting.

---

### 2. Which method is used?

`compare()`

---

### 3. Difference between Comparable and Comparator?

| Comparable     | Comparator       |
| -------------- | ---------------- |
| Inside class   | Outside class    |
| Single sorting | Multiple sorting |
| compareTo()    | compare()        |

---

### 4. When to use Comparator?

When multiple sorting logics are required.

---

## 🚀 Summary

Comparator is used for flexible sorting without modifying the original class.
