# Library Management System

## General Instructions

Apply Object-Oriented Programming concepts:
- Classes and Objects
- Encapsulation
- Inheritance
- Method Overriding
- Runtime Polymorphism

**Additional Instructions:**
- Use proper indentation and naming conventions.
- Your program must compile and run without errors.
- Use arrays to store multiple objects.
- Follow the required input/output format.

---

## Problem Description

Create a Java program that simulates a **library management system**. The program allows the user to input multiple library users, then computes and displays their penalties for late book returns. Each type of user has different penalty computation rules.

---

## Class Requirements

### 1. Base Class: `LibraryUser`

**Attributes (Private):**
- `name` (String)
- `borrowedBooks` (int)

**Methods:**
- Constructor
- Getters and setters
- Validation rule:
  - If `borrowedBooks` is less than `0`, set it to `0`
- `double calculatePenalty(int lateDays)`
  - Base implementation (to be overridden by subclasses)

---

### 2. Derived Class: `StudentUser`

Extends `LibraryUser`.

**Method Override:**
- Override `calculatePenalty(int lateDays)`

**Computation Rule:**

- Penalty = `borrowedBooks × lateDays × 10`

---

### 3. Derived Class: `TeacherUser`

Extends `LibraryUser`.

**Method Override:**
- Override `calculatePenalty(int lateDays)`

**Computation Rule:**

- Penalty = `borrowedBooks × lateDays × 5`

---

### 4. Derived Class: `GuestUser`

Extends `LibraryUser`.

**Method Override:**
- Override `calculatePenalty(int lateDays)`

**Computation Rule:**

- Penalty = `borrowedBooks × lateDays × 20`

---

## Penalty Multiplier Summary

| User Type | Multiplier |
|-----------|------------|
| Student   | `× 10`     |
| Teacher   | `× 5`      |
| Guest     | `× 20`     |

---

## Main Program Requirements

### Input

1. Ask the user: `Enter the number of users:`
2. For each user:
   - Display the user number
   - Ask for:
     - **Type:** `1` = Student, `2` = Teacher, `3` = Guest
     - **Name**
     - **Number of Borrowed Books**
     - **Late Days**
3. Store all objects inside a **single array** of type `LibraryUser[]`

---

## Sample Output

```
Enter number of users: 2

User 1
Type (1-Student, 2-Teacher, 3-Guest): 1
Name: Christine
Borrowed Books: 3
Late Days: 2

User 2
Type (1-Student, 2-Teacher, 3-Guest): 3
Name: John
Borrowed Books: 1
Late Days: 4

--- LIBRARY REPORT ---
Christine → Penalty: 60.0
John → Penalty: 80.0
TOTAL PENALTIES: 140.0
```

---

## Restrictions

- Must use **polymorphism** — only one `LibraryUser[]` array is allowed
- Must use **inheritance** and **method overriding**
- Must use **encapsulation** (private attributes + getters/setters)
- Do **not** compute penalties directly inside `main` — use `calculatePenalty()`
- Do **not** use type checking (e.g. `instanceof`) to determine user type in the display loop

---

## Rubric

| Criteria                        | Points |
|---------------------------------|--------|
| Correct class structure         | 10     |
| Encapsulation                   | 10     |
| Inheritance & Method Overriding | 10     |
| Polymorphism (single array)     | 15     |
| Correct computation logic       | 10     |
| Output format                   | 5      |