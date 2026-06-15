# 🛒 Activity 2: Product & ShoppingCart

## Instructions

Create two classes: **Product** and **ShoppingCart**.

---

## Class: Product

### Attributes (Fields)

- `String name`
- `double price`
- `int quantity`

### Method

#### `displayInfo()`

- Print product details.

---

## Class: ShoppingCart

### Method

#### `calculateTotal()`

- Accepts a `Product` object as a parameter.
- Returns the total cost.

#### `isAffordable()`

- Accepts a `Product` object.
- Returns `true` if the total cost is less than or equal to **1000**, otherwise returns `false`.

---

## Main Class

Create a **Main** class with a `main()` method that:

1. Creates two `Product` objects.
2. Creates one `ShoppingCart` object.
3. Displays each product's information.
4. Calls `calculateTotal()` for each product.
5. Calls `isAffordable()` for each product.

---

## Expected Output

```text
Product: Laptop
Price: 30000.0
Quantity: 1
Total: 30000.0
Affordable? false

Product: Mouse
Price: 500.0
Quantity: 2
Total: 1000.0
Affordable? true
```