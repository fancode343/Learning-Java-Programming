# Laboratory Activity: Bank Account System (Array Version)

## Objective

This activity applies Object-Oriented Programming (OOP) concepts such as:
- Classes and Objects
- Encapsulation
- Inheritance
- Method Overriding
- Arrays of Objects

---

## Part 1: Create Base Class (`BankAccount`)

### Instructions

1. Create a class named **`BankAccount`**
2. Add **private** attributes:
   - `accountName` (String)
   - `balance` (double)
3. Create a constructor using `this`
4. Create getters and setters
5. Create a method:
   - `displayInfo()`

---

## Part 2: Create Derived Class (`SavingsAccount`)

### Instructions

1. Create a class named **`SavingsAccount`** that `extends` `BankAccount`
2. Add attribute:
   - `interestRate` (double)
3. Create constructor:
   - Use `super(accountName, balance)`
   - Use `this.interestRate = interestRate`
4. Override `displayInfo()`:
   - Call `super.displayInfo()`
   - Display interest rate

---

## Part 3: Create `Bank` Class

### Methods to Create

**Deposit Method**
- Accepts a `BankAccount` object and amount
- Returns the updated balance after adding the deposit

**Check Low Balance Method**
- Accepts a `BankAccount` object
- Returns `true` if balance is below a defined threshold (low balance condition)

---

## Part 4: Main Class (Using Array)

### Instructions

1. Ask the user to enter number of accounts
2. Create an array:
```java
   SavingsAccount[] accounts = new SavingsAccount[n];
```
3. Use a loop to input:
   - Account Name
   - Balance
   - Interest Rate
   - Deposit amount
4. Inside the loop:
   - Create object using constructor
   - Store object in array
   - Call deposit method
5. After input, use another loop to display:
   - Account details
   - Updated balance
   - Low balance status

---

## Sample Output

```
Enter number of accounts: 2

Account 1
Name: Ana
Balance: 500
Interest Rate: 2.5
Deposit: 300

Account 2
Name: Ben
Balance: 1500
Interest Rate: 3.0
Deposit: 200

---ACCOUNT DETAILS---
Name: Ana
Balance: 800.0
Interest Rate: 2.5
Low Balance? true

Name: Ben
Balance: 1700.0
Interest Rate: 3.0
Low Balance? false
```