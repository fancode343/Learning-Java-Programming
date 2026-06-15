# 👨‍💼 Activity 1: Employee & Payroll

## Instructions

Create two classes: **Employee** and **Payroll**.

---

## Class: Employee

### Attributes (Fields)

- `String name`
- `double hoursWorked`
- `double hourlyRate`

### Method

#### `displayInfo()`

- Print employee details in a readable format.

---

## Class: Payroll

### Method

#### `calculateSalary()`

- Accepts an `Employee` object as a parameter.
- Returns the employee's salary.

#### `isOvertime()`

- Accepts an `Employee` object.
- Returns `true` if `hoursWorked` is greater than **40**, otherwise returns `false`.

---

## Main Class

Create a **Main** class with a `main()` method that:

1. Creates two `Employee` objects.
2. Creates one `Payroll` object.
3. Displays each employee's information.
4. Calls `calculateSalary()` for each employee.
5. Calls `isOvertime()` for each employee.

---

## Expected Output

```text
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