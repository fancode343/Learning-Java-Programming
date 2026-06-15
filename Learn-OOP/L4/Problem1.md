# Animal Sound System

## Objective

This activity applies the following Object-Oriented Programming (OOP) concepts:
- Abstract Classes and Methods
- Inheritance
- Method Overriding
- Classes and Objects

---

## Problem Description

Create a Java program that simulates an **Animal Sound System**. Each animal is represented as a class that extends an abstract base class. Each subclass must provide its own implementation of the `sound()` method, then display all animal sounds in the `Main` class.

---

## Class Requirements

### 1. Abstract Class: `Animal`

- Declare an **abstract method** `sound()` that each subclass must override.

---

### 2. Derived Class: `Dog`

Extends `Animal`.

**Override `sound()`:**
- Prints the sound of a dog.

---

### 3. Derived Class: `Cat`

Extends `Animal`.

**Override `sound()`:**
- Prints the sound of a cat.

---

### 4. Derived Class: `Monkey`

Extends `Animal`.

**Override `sound()`:**
- Prints the sound of a monkey.

---

### 5. Derived Class: `Snake`

Extends `Animal`.

**Override `sound()`:**
- Prints the sound of a snake.

---

## Main Program Requirements

1. Create one object for each animal: `Dog`, `Cat`, `Monkey`, `Snake`.
2. Print the header `Animal Sounds:`
3. Call `sound()` on each object and display the result labeled by animal name.

---

## Sample Output

```
Animal Sounds:
Dog: Aw aw
Cat: Meow
Monkey: Ho Ho ho
Snake: ssssssss
```

---

## Restrictions

- `Animal` **must** be declared as an `abstract` class.
- `sound()` **must** be an abstract method in `Animal`.
- Each subclass **must** override `sound()`.
- You **cannot** instantiate `Animal` directly.

---

## Rubric

| Criteria                        | Points |
|---------------------------------|--------|
| Correct abstract class structure| 10     |
| Proper use of `abstract` method | 10     |
| All subclasses override `sound()` | 15   |
| Correct output format           | 10     |
| Naming conventions & indentation| 5      |