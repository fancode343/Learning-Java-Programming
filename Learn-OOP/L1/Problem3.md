# Activity 1: Employee & Payroll

**Instructions:** Create two classes: `Employee` and `Payroll`

---

### Class: `Employee`

**Attributes (fields):**
- `String name`
- `double hoursWorked`
- `double hourlyRate`

**Method `displayInfo()`**
- Print employee details in a readable format.

---

### Class: `Payroll`

**Method `calculateSalary()`**
- Accepts an `Employee` object as a parameter.
- Returns the salary.

**Method `isOvertime()`**
- Accepts an `Employee` object.
- Returns `true` if `hoursWorked` is greater than 40, otherwise `false`.

---

### Main Class

Create a `Main` class with a `main()` method that:
- Creates two `Employee` objects.
- Creates one `Payroll` object.
- Displays each employee's info.
- Calls `calculateSalary()` and `isOvertime()` for each employee.

---

### Output

```
Name: John Dela Cruz
Hours Worked: 45
Hourly Rate: 150.0
Salary: 6750.0
Overtime? true

Name: Maria Santos
Hours Worked: 38
Hourly Rate: 120.0
Salary: 4560.0
Overtime? false
```

---

# Activity 2: Product & ShoppingCart

**Instructions:** Create two classes: `Product` and `ShoppingCart`

---

### Class: `Product`

**Attributes (fields):**
- `String name`
- `double price`
- `int quantity`

**Method `displayInfo()`**
- Print product details.

---

### Class: `ShoppingCart`

**Method `calculateTotal()`**
- Accepts a `Product` object as a parameter.
- Returns total cost.

**Method `isAffordable()`**
- Accepts a `Product` object.
- Returns `true` if total cost is less than or equal to 1000.

---

### Main Class

Create a `Main` class with a `main()` method that:
- Creates two `Product` objects.
- Creates one `ShoppingCart` object.
- Displays each product's info.
- Calls `calculateTotal()` and `isAffordable()` for each product.

---

### Output

```
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
