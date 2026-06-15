# 📦 Packages & Modifiers

**CCC102**

---

# 📚 Discussion Outline

- Packages
- Creating Packages
- Creating Classes
- Importing Packages
- Class Instantiation
- Access Modifiers
- Non-Access Modifiers
- Activity

---

# 📦 Packages

A **package** is a folder in a Java project where related classes and code are stored in the same directory.

---

# 🏗️ Creating Packages

We can create multiple packages inside a Java project. These packages can also be reused in other projects if needed.

---

# 📝 Creating Classes

Classes can be created inside a package and imported into the main class so they can be used throughout the program.

---

# 📦 Why Use Packages?

✅ **Organizes Code**

- Keeps related classes together.

✅ **Prevents Name Conflicts**

- Two classes can have the same name if they belong to different packages.

✅ **Improves Reusability**

- Easy to import and reuse code.

✅ **Controls Access**

- Supports access modifiers such as `public`, `protected`, etc.

---

# 📥 Importing Packages

## Import a Specific Class

```java
import packageName.className;
```

## Import an Entire Package

```java
import packageName.*;
```

### 📌 Quick Tips

✅ Always use lowercase package names.

Example:

```java
shapes
utilities
```

✅ Use `import` to access classes from other packages.

---

# 📂 Types of Packages

## 1. Built-in Packages

Provided by Java.

Examples:

```java
java.util
java.io
```

Common classes include:

- ArrayList
- Scanner
- Date
- Calendar

---

## 2. User-defined Packages

Packages created by developers to organize custom code.

---

# 🏗️ Class Instantiation

Class instantiation is the process of creating an object (instance) of a class.

### Syntax

```java
ClassName identifier = new ClassName();
```

### Example

```java
Arithmetic operation = new Arithmetic();
```

---

# 🔐 Access Modifiers

Access modifiers determine where classes, variables, and methods can be accessed.

---

## Access Modifiers for Classes

| Modifier  | Description                                |
| --------- | ------------------------------------------ |
| `public`  | 🌍 Accessible everywhere                   |
| `default` | 🏠 Accessible only within the same package |

### Notes

### `public`

- Accessible inside a class
- Accessible outside a class
- Accessible inside and outside the package
- Commonly used for main classes

### `default`

- No keyword required
- Accessible only within the same package
- Ideal for internal code

---

## Access Modifiers for Methods & Fields

| Modifier    | Description                                             |
| ----------- | ------------------------------------------------------- |
| `public`    | 🌍 Accessible anywhere as long as it is imported        |
| `default`   | 🏠 Accessible within the same package only              |
| `protected` | 👪 Accessible within the same package and by subclasses |
| `private`   | 🔐 Accessible only within the class                     |

---

## Fields in Java

A **field** is a variable that belongs to a class or object.

Types:

- Instance Variable (non-static)
- Class Variable (static)

---

# ⚙️ Non-Access Modifiers

Non-access modifiers control the behavior and functionality of classes, methods, and variables.

---

## Non-Access Modifiers for Classes

| Modifier   | Description                       | Usage                       |
| ---------- | --------------------------------- | --------------------------- |
| `final`    | 🚫 Cannot be inherited            | Utility classes             |
| `abstract` | 🧩 Cannot create objects directly | Blueprint for other classes |

---

## Inheritance and Final Classes

Inheritance allows a child class to inherit properties and methods from a parent class.

Example:

```java
class Parent {
}

class Child extends Parent {
}
```

If a class is declared as `final`, it cannot be inherited.

```java
final class Parent {
}

// ❌ Error
class Child extends Parent {
}
```

---

## Non-Access Modifiers for Methods & Variables

| Modifier       | Description                                              |
| -------------- | -------------------------------------------------------- |
| `static`       | Called without creating an object; shared by all objects |
| `final`        | Cannot be changed after assignment or overridden         |
| `abstract`     | No method body; must be implemented by child classes     |
| `synchronized` | Allows only one thread at a time                         |
| `transient`    | Excluded from serialization                              |
| `volatile`     | Always fetches the latest value                          |

---

# 📊 Access vs Non-Access Modifiers

| Aspect     | Access Modifiers                            | Non-Access Modifiers                          |
| ---------- | ------------------------------------------- | --------------------------------------------- |
| Purpose    | Controls access                             | Controls behavior                             |
| Focus      | Visibility                                  | Functionality                                 |
| Examples   | `public`, `private`, `protected`, `default` | `static`, `final`, `abstract`, `synchronized` |
| Classes    | `public`, `default`                         | `final`, `abstract`                           |
| Methods    | Controls who can call                       | Controls how it behaves                       |
| Variables  | Controls who can access data                | Controls how data behaves                     |
| Main Focus | Security & Visibility                       | Behavior & Functionality                      |

---

# 📦 For Classes

✅ **Access Modifiers**

- Control where the class can be accessed

✅ **Non-Access Modifiers**

- Control how the class behaves

---

# 🔧 For Methods

✅ **Access Modifiers**

- Control who can call the method

✅ **Non-Access Modifiers**

- Control how the method behaves

---

# 📋 For Fields / Variables

✅ **Access Modifiers**

- Control who can access the data

✅ **Non-Access Modifiers**

- Control how the data behaves

---

# 🎯 Summary

## Access Modifiers

Focus on:

- Security
- Visibility

Think of them as:

> 🚪 Doors that control who can enter.

---

## Non-Access Modifiers

Focus on:

- Functionality
- Behavior

Think of them as:

> 📜 Rules that control what happens inside.

---
