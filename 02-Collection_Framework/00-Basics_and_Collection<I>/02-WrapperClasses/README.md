# Wrapper Classes in Java

Wrapper classes are used to convert primitive data types into objects.

---

## 📌 Why Wrapper Classes?

* Collections store only objects
* Required for converting primitives to objects
* Useful in APIs and frameworks

---

## 🔄 Primitive to Wrapper Mapping

| Primitive | Wrapper   |
| --------- | --------- |
| int       | Integer   |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |

---

## 🔁 Autoboxing and Unboxing

* **Autoboxing** → primitive to object
* **Unboxing** → object to primitive

---

## 💡 Example

```java
Integer a = 10; // autoboxing
int b = a;      // unboxing
```

---

## ⚙️ Usage in Collections

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
```

---

## 🔥 Interview Questions

### 1. Why wrapper classes are needed?

Because collections cannot store primitive types.

---

### 2. What is autoboxing?

Automatic conversion of primitive to object.

---

### 3. Can we store int in ArrayList?

No, use Integer.

---

## 🚀 Summary

Wrapper classes allow primitive values to be used as objects, making them compatible with collections and APIs.
