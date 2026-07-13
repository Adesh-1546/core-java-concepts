# Arrays Basics in Java

An array is a collection of elements of the same data type stored in contiguous memory locations.

---

## 📌 Key Points

* Fixed size
* Stores homogeneous data
* Indexed (starts from 0)
* Faster access using index

---

## 🔑 Types of Initialization

### 1. Declaration

```java
int[] arr;
```

---

### 2. Static Initialization

Values are assigned at the time of declaration.

```java
int[] arr = {10, 20, 30};
```

---

### 3. Dynamic Initialization

Size is defined first, values assigned later.

```java
int[] arr = new int[3];
arr[0] = 10;
```

---

## 🔄 Default Values

| Type    | Default |
| ------- | ------- |
| int     | 0       |
| double  | 0.0     |
| boolean | false   |
| Object  | null    |

---

## 🔥 Interview Questions

### 1. What is an array?

Collection of same type elements stored in contiguous memory.

---

### 2. Difference between static and dynamic initialization?

Static → values at declaration
Dynamic → values assigned later

---

### 3. What is default value of int array?

0

---

## 🚀 Summary

Arrays provide a simple way to store multiple values of the same type with fast access using indexes.
