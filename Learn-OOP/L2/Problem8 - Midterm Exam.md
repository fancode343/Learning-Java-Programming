# Midterm Exam – Online Order System

## General Instructions

1. Apply Object-Oriented Programming concepts:
   - Classes and Objects
   - Encapsulation
   - Inheritance
   - Method Overriding
2. Use proper indentation and naming conventions.
3. Your program must compile and run without errors.
4. Use arrays to store multiple objects.
5. Follow the required input/output format.

---

## Problem Description

Create a Java program that simulates an online ordering system. The program allows the user to input multiple orders consisting of food and drinks, then computes and displays the total bill. Each type of item has different rules for computing its total price.

---

## Class Requirements

### 1. Base Class: `MenuItem`

**Attributes (Private):**

- `name` (String)
- `price` (double)

**Methods:**

- Constructor
- Getters and setter methods
- Validation rule:
  - If `price` is less than or equal to `0`, set it to `0`
- `double getTotalPrice()`

---

### 2. Derived Class: `FoodItem`

Create a class `FoodItem` that `extends` `MenuItem`.

**Additional Attribute (Private):**

- `quantity` (int)

**Method Override:**

- Override `getTotalPrice()`:
  - Returns `price × quantity`

---

### 3. Derived Class: `DrinkItem`

Create a class `DrinkItem` that `extends` `MenuItem`.

**Additional Attribute (Private):**

- `size` (int)
  - `1` = Small
  - `2` = Medium
  - `3` = Large

**Method Override:**

- Override `getTotalPrice()`

**Computation Rules:**

| Size   | Multiplier |
| ------ | ---------- |
| Small  | `1.0`      |
| Medium | `1.2`      |
| Large  | `1.5`      |

Returns `price × multiplier`

---

## Main Program Requirements

### Input

1. Ask the user: `Enter the number of orders:`
2. For each order:
   - Display order number
   - Ask for:
     - **Type:** `1` = Food, `2` = Drink
     - **Name**
     - **Price**
   - Additional inputs:
     - If **Food:** ask for `Quantity`
     - If **Drink:** ask for `Size (1–3)`

---

## Sample Output

```
Enter number of orders: 2

Order 1
Type (1-Food, 2-Drink): 1
Name: Burger
Price: 120
Quantity: 2

Order 2
Type (1-Food, 2-Drink): 2
Name: Coffee
Price: 80
Size (1-Small, 2-Medium, 3-Large): 3

--- RECEIPT ---
Burger → 240.0
Coffee → 120.0
TOTAL BILL: 360.0
```

---

## Restrictions

- Must use **inheritance**
- Must use **encapsulation** (private variables + setters/getters)
- Must use **method overriding**
- Must use **array of objects**
- Do not compute totals directly inside `main` — use class methods

---

## Rubric

| Criteria                  | Points |
| ------------------------- | ------ |
| Correct class structure   | 10     |
| Encapsulation             | 10     |
| Inheritance               | 10     |
| Correct computation logic | 15     |
| Output format             | 5      |
