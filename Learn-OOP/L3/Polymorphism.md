# Polymorphism in Java

## What is Polymorphism?
### AI NI, WAKOY NOTES ANI

Polymorphism is one of the four core principles of Object-Oriented Programming (OOP).
The word comes from Greek, meaning **"many forms"** — it allows one thing to behave in different ways depending on context.

---

## Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

Occurs when **multiple methods share the same name** but have different parameters.
Resolved at **compile time**.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

> The compiler decides which `add()` to call based on the arguments passed.

---

### 2. Runtime Polymorphism (Method Overriding)

Occurs when a **subclass provides its own version** of a method defined in the parent class.
Resolved at **runtime**.

```java
class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}
```

```java
// Runtime polymorphism in action
Animal a;

a = new Dog();
a.sound(); // Output: Bark!

a = new Cat();
a.sound(); // Output: Meow!
```

> Even though `a` is of type `Animal`, the actual method called depends on the **object assigned at runtime**.

---

## Key Concepts

### `@Override` Annotation
- Tells the compiler you are intentionally overriding a parent method.
- Helps catch errors if the method signature doesn't match.

### Upcasting
Assigning a **child object to a parent reference**.

```java
Animal a = new Dog(); // Upcasting
```

### Downcasting
Converting a parent reference back to a child type.

```java
Animal a = new Dog();
Dog d = (Dog) a; // Downcasting
```

---

## Polymorphism with Arrays

Polymorphism becomes powerful when used with **arrays of objects**:

```java
Animal[] animals = new Animal[3];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Dog();

for (Animal a : animals) {
    a.sound(); // Calls the correct overridden method for each object
}
```

**Output:**
```
Bark!
Meow!
Bark!
```

---

## Polymorphism vs Overloading vs Overriding

| Feature     | Overloading                  | Overriding                        |
|-------------|------------------------------|-----------------------------------|
| Type        | Compile-time polymorphism    | Runtime polymorphism              |
| Where       | Same class                   | Parent and child class            |
| Parameters  | Must differ                  | Must be the same                  |
| `@Override` | Not used                     | Recommended                       |
| Resolved at | Compile time                 | Runtime                           |

---

## Why Polymorphism Matters

- Reduces code duplication
- Makes code more flexible and scalable
- Allows a single interface to represent different underlying data types
- Works hand-in-hand with **inheritance** and **method overriding**

---

## Quick Summary

> **One name, many forms.**
> Polymorphism lets you write code that works with objects of different types
> through a common interface — making your programs cleaner and easier to extend.