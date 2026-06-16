# Laboratory Activity: Java Packages – Number Analysis

You will develop a **Number Analysis Program** that analyzes a set of numbers entered by the user. Instead of placing all methods in a single class, the program must be organized using **multiple packages**, where each package contains a specific class responsible for a particular analysis. This activity will test your ability to properly create packages, import classes, and call methods from different packages.

---

## Project Setup

Create a Java Project named:

```text
PackageLaboratory
```

Inside the project, create the following packages and classes:

```text
mainpackage
└── MainProgram.java

evenpackage
└── EvenAnalyzer.java

oddpackage
└── OddAnalyzer.java

primepackage
└── PrimeAnalyzer.java

averagepackage
└── AverageAnalyzer.java
```

---

## Package Responsibilities

### 📁 mainpackage

#### MainProgram.java

- Contains the main method.
- Ask the user how many numbers will be entered.
- Accept the numbers and store them in an array.
- Call the appropriate methods from the other packages to perform the analysis.

---

### 📁 evenpackage

#### EvenAnalyzer.java

- Identify all even numbers in the array.
- Display the even numbers.
- Display the total number of even values.

---

### 📁 oddpackage

#### OddAnalyzer.java

- Identify all odd numbers in the array.
- Display the odd numbers.
- Display the total number of odd values.

---

### 📁 primepackage

#### PrimeAnalyzer.java

- Determine which numbers in the array are prime numbers.
- Display the prime numbers.
- Display the total number of prime numbers.

---

### 📁 averagepackage

#### AverageAnalyzer.java

- Compute the average of all numbers in the array.
- Display the average value.
- Identify the numbers that are above the average.
- Display how many numbers are above the average.

---

## Expected Output Example

```text
How many numbers will you enter? 6

Enter number 1: 12
Enter number 2: 7
Enter number 3: 9
Enter number 4: 10
Enter number 5: 3
Enter number 6: 15

Even Numbers: 12 10 (2)
Odd Numbers: 7 9 3 15 (4)
Prime Numbers: 7 3 (2)
Average: 9.33
Numbers Above Average: 12 10 15 (3)
```

---

## Program Flow

1. Ask the user for the number of values.
2. Store all values in an integer array.
3. Call `EvenAnalyzer` to find even numbers.
4. Call `OddAnalyzer` to find odd numbers.
5. Call `PrimeAnalyzer` to find prime numbers.
6. Call `AverageAnalyzer` to compute the average and identify numbers above it.
7. Display the results.

---

## Suggested Method Structure

### EvenAnalyzer.java

```java
public static void analyzeEven(int[] numbers) {
    // display even numbers and count
}
```

### OddAnalyzer.java

```java
public static void analyzeOdd(int[] numbers) {
    // display odd numbers and count
}
```

### PrimeAnalyzer.java

```java
public static void analyzePrime(int[] numbers) {
    // display prime numbers and count
}
```

### AverageAnalyzer.java

```java
public static void analyzeAverage(int[] numbers) {
    // compute average
    // display numbers above average
}
```

### CODE: 
- [https://drive.google.com/file/d/1kHfTRJDkNe6vbu3bbnP-U8mq5izYUHcA/view?usp=drive_link](https://drive.google.com/file/d/1kHfTRJDkNe6vbu3bbnP-U8mq5izYUHcA/view?usp=drive_link)