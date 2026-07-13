# String Comparison in Java

String comparison in Java can be done using `==` and `equals()` methods.

---

## 🔑 Ways to Compare Strings

### 1. Using == Operator

* Compares **references (memory address)**
* Checks if both variables point to same object

```java
String s1 = "Java";
String s2 = "Java";

s1 == s2  → true
```

---

### 2. Using equals() Method

* Compares **actual content (values)**

```java
s1.equals(s2) → true
```

---

## ⚖️ Difference Between == and equals()

| ==                    | equals()           |
| --------------------- | ------------------ |
| Compares reference    | Compares content   |
| Faster                | Logical comparison |
| May give false result | Accurate result    |

---

## 🔄 String Creation Impact

### 🔹 String Literal

* Stored in String Constant Pool
* Same reference reused

---

### 🔹 new Keyword

* Creates new object in heap
* Different reference

---

## 🔹 intern() in Comparison

* Converts heap string to SCP reference
* Helps in reference equality

---

## 💡 Example

```java
String s1 = "Java";
String s2 = new String("Java");

s1 == s2        → false
s1.equals(s2)   → true
```

---

## 🔥 Interview Questions

### 1. Difference between == and equals()?

== compares reference, equals() compares content.

---

### 2. Why equals() returns true but == returns false?

Because content is same but memory location is different.

---

### 3. What is equalsIgnoreCase()?

Compares strings ignoring case.

---

### 4. How intern() helps in comparison?

It returns reference from SCP, making == true.

---

## ⚠️ Important Points

* Always use equals() for string comparison
* == should be used only for reference check
* String comparison is case-sensitive

---

## 🚀 Summary

String comparison can be done using == and equals(). equals() is preferred for comparing actual string values.
