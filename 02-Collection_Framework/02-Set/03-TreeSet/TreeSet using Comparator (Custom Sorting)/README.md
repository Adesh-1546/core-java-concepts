# TreeSet Sorting using Comparator

Comparator is an interface used to define custom sorting logic outside the class.

---

## 🔑 Key Points

* Present in `java.util` package
* Used for custom sorting
* Multiple sorting logics possible
* Overrides `compare()` method

---

## ⚙️ How it Works

* Comparator is passed to TreeSet
* Sorting is based on `compare()` method

---

## 💡 Example

Sorting students by name using Comparator.

---

## 🔥 Interview Questions

### 1. What is Comparator?

An interface used to define custom sorting logic.

---

### 2. Which method is used in Comparator?

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

When multiple sorting logics are needed.

---

## 🚀 Summary

Comparator is used for flexible and multiple sorting strategies without modifying the original class.
