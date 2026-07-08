# TreeSet Sorting using Comparable

Comparable is an interface used to define the natural sorting of objects.

---

## 🔑 Key Points

* Present in `java.lang` package
* Used for default (natural) sorting
* Class must implement Comparable
* Overrides `compareTo()` method

---

## ⚙️ How it Works

* Objects are compared using `compareTo()`
* Sorting is done automatically in TreeSet

---

## 💡 Example

Sorting students by ID using `compareTo()`.

---

## 🔥 Interview Questions

### 1. What is Comparable?

An interface used to define natural ordering of objects.

---

### 2. Which method is used in Comparable?

`compareTo()`

---

### 3. Where is Comparable used?

* TreeSet
* Collections.sort()

---

### 4. What does compareTo() return?

* 0 → equal
* Positive → greater
* Negative → smaller

---

## 🚀 Summary

Comparable is used when you want a single default sorting logic inside the class.
