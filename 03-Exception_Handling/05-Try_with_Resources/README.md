# Try-With-Resources in Java

Try-With-Resources is a feature introduced in Java 7 that allows automatic closing of resources after use.

---

## 📌 What is a Resource?

A resource is any object that needs to be closed after use.

### Examples:

* FileReader
* BufferedReader
* Scanner
* Database Connection

---

## 🔑 Why Try-With-Resources?

* Automatically closes resources
* Reduces boilerplate code
* Prevents memory leaks
* Cleaner and more readable code

---

## ⚙️ Syntax

```java
try (Resource resource = new Resource()) {
    // use resource
} catch (Exception e) {
    // handle exception
}
```

---

## 💡 How It Works

* Resources are declared inside `try()`
* They must implement `AutoCloseable` interface
* JVM automatically calls `close()` after execution

---

## 🔄 Traditional vs Try-With-Resources

### ❌ Traditional Approach

```java
Resource r = null;
try {
    r = new Resource();
} finally {
    if (r != null) {
        r.close();
    }
}
```

---

### ✅ Try-With-Resources

```java
try (Resource r = new Resource()) {
    // use resource
}
```

---

## 🔥 Interview Questions

### 1. What is Try-With-Resources?

A feature to automatically close resources.

---

### 2. Which interface is required?

AutoCloseable

---

### 3. Why is it better than finally?

Because it reduces code and prevents resource leaks.

---

### 4. Can we use multiple resources?

Yes.

---

## ⚠️ Important Points

* Introduced in Java 7
* Works with classes implementing AutoCloseable
* Eliminates need for finally block for closing resources

---

## 🚀 Summary

Try-With-Resources simplifies resource management by automatically closing resources and improving code readability and safety.
