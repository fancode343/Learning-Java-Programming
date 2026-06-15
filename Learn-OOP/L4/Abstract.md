# Abstract Classes and Methods in Java

## What is an Abstract Class?

An **abstract class** is a class that **cannot be instantiated** — meaning you cannot
create an object directly from it. It serves as a **blueprint** for other classes.

```java
abstract class Animal {
    // cannot do: Animal a = new Animal(); ❌
}
```

---

## What is an Abstract Method?

An **abstract method** is a method that is **declared but has no body**.
The subclass is **required** to provide its own implementation.

```java
abstract class Animal {
    abstract void sound(); // no body, no curly braces
}
```

> If a class has at least one abstract method, the class itself **must** be declared abstract.

---

## Syntax

```java
abstract class ClassName {
    // regular attributes and methods
    String name;

    // abstract method — no body
    abstract void abstractMethod();

    // concrete method — has body
    void regularMethod() {
        System.out.println("This is a regular method.");
    }
}
```

---

## Implementing an Abstract Class

A subclass **must override all abstract methods**, otherwise it must also be declared abstract.

```java
abstract class Shape {
    abstract double getArea();

    void display() {
        System.out.println("Area: " + getArea());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}
```

```java
// Usage
Shape s1 = new Circle(5);
Shape s2 = new Rectangle(4, 6);

s1.display(); // Area: 78.53...
s2.display(); // Area: 24.0
```

---

## Abstract Class with Polymorphism

Abstract classes work naturally with **polymorphism** — you can use the abstract class
as the reference type and store different subclass objects.

```java
Shape[] shapes = new Shape[3];
shapes[0] = new Circle(3);
shapes[1] = new Rectangle(4, 5);
shapes[2] = new Circle(7);

for (Shape s : shapes) {
    s.display(); // calls the correct getArea() for each object
}
```

---

## Abstract vs Regular Class

| Feature                        | Regular Class | Abstract Class |
|-------------------------------|---------------|----------------|
| Can be instantiated            | ✅ Yes        | ❌ No          |
| Can have abstract methods      | ❌ No         | ✅ Yes         |
| Can have concrete methods      | ✅ Yes        | ✅ Yes         |
| Can have constructors          | ✅ Yes        | ✅ Yes         |
| Subclass must override methods | ❌ No         | ✅ Yes         |

---

## Abstract vs Interface

| Feature                  | Abstract Class        | Interface                  |
|--------------------------|-----------------------|----------------------------|
| Keyword                  | `abstract class`      | `interface`                |
| Methods                  | Abstract + Concrete   | Abstract only (by default) |
| Variables                | Any type              | `public static final` only |
| Inheritance keyword      | `extends`             | `implements`               |
| Multiple inheritance     | ❌ Not supported      | ✅ Supported               |

---

## Rules to Remember

- A class **must** be declared `abstract` if it contains even one abstract method.
- A subclass **must override** all abstract methods or be declared abstract itself.
- Abstract classes **can have** constructors, but they are called via `super()`.
- You **can** use an abstract class as a reference type (polymorphism).
- You **cannot** instantiate an abstract class directly.

---

## Why Use Abstract Classes?

- Enforces a **common structure** across related classes
- Prevents incomplete classes from being instantiated
- Promotes **code reusability** through shared concrete methods
- Works seamlessly with **inheritance** and **polymorphism**

---

## Quick Summary

> An abstract class is an **incomplete class** that acts as a template.
> It defines *what* subclasses should do through abstract methods,
> while optionally providing shared behavior through concrete methods.