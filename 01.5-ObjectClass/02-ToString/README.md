# toString() Method in Java

The `toString()` method is defined in the Object class and is used to return a string representation of an object.

---

## 📌 Default Behavior

By default, `toString()` returns:

ClassName@HashCode

Example:
Student@1a2b3c

---

## 🔑 Why Override toString()?

* To provide meaningful output
* To display object details
* Useful for debugging

---

## ⚙️ Syntax

```java
@Override
public String toString() {
    return "custom string";
}
```

---

## 💡 Example

```java
Student [id=101, name=Adesh]
```

---

## 🔥 Interview Questions

### 1. What is toString() method?

Returns string representation of an object.

---

### 2. Why override toString()?

To print meaningful object data instead of default value.

---

### 3. What happens if not overridden?

It prints class name and hashcode.

---

## ⚠️ Important Points

* Automatically called when printing object
* Used in logging and debugging
* Present in Object class

---

## 🚀 Summary

The toString() method is used to represent an object as a string. Overriding it improves readability and debugging.
