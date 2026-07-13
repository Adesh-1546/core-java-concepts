# Two-Dimensional Arrays in Java

A 2D array is a collection of elements organized in rows and columns (matrix form).

---

## 📌 Key Points

* Represented as `int[][]`
* Accessed using two indices: row and column
* Used in matrix-based problems

---

## 🔑 Example

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

---

## 🔄 Traversal

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
    }
}
```

---

## 🔥 Interview Questions

### 1. What is a 2D array?

Array of arrays (matrix).

---

### 2. How to access element?

matrix[i][j]

---

## 🚀 Summary

2D arrays are used to represent tabular data like matrices using rows and columns.
