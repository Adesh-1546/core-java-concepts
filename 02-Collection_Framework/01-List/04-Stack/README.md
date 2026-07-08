# Stack in Java

Stack is a class in the Java Collections Framework that extends Vector and follows the LIFO (Last In First Out) principle.

---

## 🔑 Key Features

* Follows LIFO (Last In First Out)
* Extends Vector class
* Thread-safe (synchronized)
* Allows duplicate elements

---

## ⚙️ Basic Operations

| Method    | Description                          |
| --------- | ------------------------------------ |
| push()    | Adds element to top                  |
| pop()     | Removes and returns top element      |
| peek()    | Returns top element without removing |
| isEmpty() | Checks if stack is empty             |
| search()  | Returns position from top            |

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| push      | O(1)            |
| pop       | O(1)            |
| peek      | O(1)            |
| search    | O(n)            |

---

## 💡 When to Use Stack

* Undo/Redo operations
* Expression evaluation (infix, postfix)
* Backtracking algorithms
* Browser history navigation

---

## ⚠️ Limitations

* Inherits from Vector (legacy design)
* Rarely used in modern applications
* Better alternative:

  * Deque (ArrayDeque)

---

## ⚖️ Stack vs Deque

| Feature     | Stack   | Deque       |
| ----------- | ------- | ----------- |
| Type        | Legacy  | Modern      |
| Performance | Slower  | Faster      |
| Usage       | Limited | Recommended |

---

## 🧠 Example Use Cases

* Undo operations in editors
* Function call stack
* Parsing expressions

---

## 🚀 Summary

Stack is a simple data structure that follows LIFO. While useful for understanding concepts, modern Java applications prefer Deque for better performance and flexibility.
