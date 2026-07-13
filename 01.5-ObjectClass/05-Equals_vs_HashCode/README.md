# equals() vs hashCode() in Java

The `equals()` and `hashCode()` methods are closely related and must be used together correctly.

---

## 🔑 Relationship Rule

If two objects are equal using equals()
→ They must have the same hashCode()

---

## ⚙️ How They Work Together

1. hashCode() decides bucket
2. equals() compares actual objects

---

## ⚖️ Difference

| equals()                | hashCode()       |
| ----------------------- | ---------------- |
| Compares content        | Returns integer  |
| Used for equality check | Used for hashing |
| Boolean result          | Integer result   |

---

## 💡 Example Scenario

* Two objects have same data
* equals() → true
* hashCode() → same value

---

## 🔥 Interview Questions

### 1. Why override both?

To maintain consistency in collections.

---

### 2. What happens if only equals() is overridden?

Collections like HashMap may behave incorrectly.

---

### 3. Can two objects have same hashCode but not equal?

Yes.

---

### 4. Can two objects be equal but have different hashCode?

No.

---

## ⚠️ Important Points

* Always override both together
* Used in HashMap and HashSet
* Prevents duplicate issues

---

## 🚀 Summary

equals() and hashCode() must be consistent for proper functioning of hash-based collections.
