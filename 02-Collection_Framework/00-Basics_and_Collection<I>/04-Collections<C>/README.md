# Collections Class in Java

The `Collections` class is a utility class in Java that provides static methods to perform operations on collection objects.

---

## 📌 Key Points

* Present in `java.util` package
* Contains only static methods
* Used to manipulate collections like List, Set, etc.
* Cannot be instantiated

---

## 🔑 Common Methods

### 1. sort()

Sorts elements in a list

```java id="kz9r1r"
Collections.sort(list);
```

---

### 2. reverse()

Reverses the list

```java id="ntw8c3"
Collections.reverse(list);
```

---

### 3. shuffle()

Randomly shuffles elements

```java id="3k3q7v"
Collections.shuffle(list);
```

---

### 4. min() and max()

Finds minimum and maximum element

```java id="s8y1xg"
Collections.min(list);
Collections.max(list);
```

---

### 5. binarySearch()

Searches element in sorted list

```java id="pf5p9a"
Collections.binarySearch(list, key);
```

---

### 6. frequency()

Counts occurrences of element

```java id="h0g7kc"
Collections.frequency(list, element);
```

---

## ⚙️ Example Usage

```java id="r7kt6n"
List<Integer> list = new ArrayList<>();
list.add(3);
list.add(1);
list.add(2);

Collections.sort(list);
```

---

## 🔥 Interview Questions

### 1. What is Collections class?

A utility class used to perform operations on collections.

---

### 2. Difference between Collection and Collections?

| Collection        | Collections      |
| ----------------- | ---------------- |
| Interface         | Utility class    |
| Stores data       | Provides methods |
| Part of hierarchy | Helper class     |

---

### 3. Can we create object of Collections class?

No.

---

### 4. Why use Collections class?

To perform operations like sorting, searching, and manipulation.

---

## ⚠️ Important Points

* Works mainly with List
* Methods are static
* Often used with Comparable and Comparator

---

## 🚀 Summary

The Collections class provides powerful utility methods to manipulate and process collection objects efficiently.
