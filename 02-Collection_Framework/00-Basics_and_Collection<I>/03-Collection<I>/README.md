# Java Collections Framework

The Java Collections Framework (JCF) is a set of classes and interfaces used to store, manage, and manipulate groups of objects efficiently.

---

## 🔑 What is Collection Interface?

The `Collection` interface is the root interface of the Java Collections Framework.

It represents a group of objects (elements) and provides basic operations such as:

* Adding elements
* Removing elements
* Searching elements
* Iterating over elements

---

## 📚 Hierarchy Overview

```text
Collection (Interface)
│
├── List
│   ├── ArrayList
│   ├── LinkedList
│   ├── Vector
│   └── Stack
│
├── Set
│   ├── HashSet
│   └── LinkedHashSet
│
└── Queue
    └── PriorityQueue

Map (Separate Interface)
│
├── HashMap
└── LinkedHashMap
```

---

## ⚠️ Important Note

* `Map` is **not part of Collection interface**
* It is a separate interface but part of the Collections Framework

---

## 🔧 Common Methods of Collection Interface

| Method     | Description                   |
| ---------- | ----------------------------- |
| add()      | Adds element                  |
| remove()   | Removes element               |
| contains() | Checks if element exists      |
| size()     | Returns number of elements    |
| isEmpty()  | Checks if collection is empty |
| clear()    | Removes all elements          |

---

## 💡 Why Use Collections?

* Dynamic data storage
* Built-in data structures
* Reduces coding effort
* Improves performance

---

## 🧠 Real-Life Example

Think of a collection like a container:

* List → Ordered items (like a playlist)
* Set → Unique items (like roll numbers)
* Queue → Processing order (like ticket queue)

---

## 🚀 Summary

The Collection interface is the foundation of the Java Collections Framework. It provides a standard way to handle groups of objects and simplifies data management in Java applications.

