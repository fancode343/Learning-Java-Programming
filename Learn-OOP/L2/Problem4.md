# 🏦 Laboratory Activity: BankAccount & Bank

## Instructions

Create two classes: **BankAccount** and **Bank**.

---

## Class: BankAccount

### Attributes (Fields)

- `String accountName`
- `double balance`

### Method

#### `displayInfo()`

- Print account details.

---

## Class: Bank

### Method

#### `deposit(BankAccount acc, double amount)`

- Accepts a `BankAccount` object.
- Returns the updated balance after the deposit.

#### `isLowBalance(BankAccount acc)`

- Accepts a `BankAccount` object.
- Returns `true` if the balance is less than **500**, otherwise returns `false`.

---

## Main Class

Create a **Main** class with a `main()` method that:

1. Creates two `BankAccount` objects.
2. Creates one `Bank` object.
3. Displays each account's information.
4. Calls `deposit()` for each account.
5. Calls `isLowBalance()` for each account.

---

## Expected Output

```text
Account Name: Juan Dela Cruz
Balance: 1000.0
New Balance after deposit: 1500.0
Low Balance? false

Account Name: Ana Santos
Balance: 300.0
New Balance after deposit: 800.0
Low Balance? true
```