# Employee Payroll System (EPS)

## Objective

This activity applies Object-Oriented Programming (OOP) concepts such as:
- Classes and Objects
- Encapsulation
- Inheritance
- Method Overriding
- **Polymorphism**
- Arrays of Objects

---

## Problem Description

Create a Java program that simulates an **Employee Payroll System**. The program allows the user to input multiple employees — either Full Time or Part Time — then computes and displays each employee's salary. Use **polymorphism** to handle different employee types through a single array.

---

## Class Requirements

### 1. Base Class: `Employee`

**Attributes (Private):**
- `name` (String)
- `baseSalary` (double)

**Methods:**
- Constructor
- Getters and setters
- `double computeSalary()`
  - Base implementation (to be overridden by subclasses)

---

### 2. Derived Class: `FullTimeEmployee`

Extends `Employee`.

**Additional Attributes (Private):**
- `overtimeHours` (int)
- `performance` (String)

**Method Override:**
- Override `computeSalary()`

**Computation Rules:**

| Performance | Bonus         |
|-------------|---------------|
| Excellent   | 20% of base   |
| Good        | 10% of base   |
| Average     | 5% of base    |
| Poor        | No bonus      |

- Overtime pay = `overtimeHours × 50`
- Total = `baseSalary + overtimeBonus + performanceBonus`

---

### 3. Derived Class: `PartTimeEmployee`

Extends `Employee`.

**Additional Attributes (Private):**
- `hoursWorked` (int)
- `hourlyRate` (double)

**Method Override:**
- Override `computeSalary()`
- Total = `baseSalary + (hoursWorked × hourlyRate)`

---

## Main Program Requirements

### Input

1. Ask the user: `Enter the number of employees:`
2. For each employee:
   - Ask for **Type:** `1` = Full Time, `2` = Part Time
   - **Name**
   - **Base Salary**
   - Additional inputs:
     - If **Full Time:** `Overtime Hours` and `Performance (Excellent/Good/Average/Poor)`
     - If **Part Time:** `Hours Worked` and `Hourly Rate`

### Key Requirement
- Use a **single array** of type `Employee[]` to store all employee objects.
- Use **polymorphism** — call `computeSalary()` on each element without checking the type.

---

## Sample Output

```
Enter the number of employees: 2

Type (1-Full Time, 2-Part Time): 1
Name: Juan
Base Salary: 10000
Overtime Hours: 5
Performance (Excellent/Good/Average/Poor): Good

Type (1-Full Time, 2-Part Time): 2
Name: Maria
Base Salary: 3000
Hours Worked: 20
Hourly Rate: 80.0

--PAYROLL SUMMARY--
Juan --> 12500.0
Maria --> 4600.0
```

---

## Restrictions

- Must use **polymorphism** — only one `Employee[]` array is allowed
- Do **not** use `null` checking to determine employee type
- Must use **inheritance** and **method overriding**
- Must use **encapsulation** (private attributes + getters/setters)
- Do **not** compute salary directly inside `main` — use `computeSalary()`

---

## Rubric

| Criteria                       | Points |
|--------------------------------|--------|
| Correct class structure        | 10     |
| Encapsulation                  | 10     |
| Inheritance & Method Overriding| 10     |
| Polymorphism (single array)    | 15     |
| Correct computation logic      | 10     |
| Output format                  | 5      |