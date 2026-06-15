# Array Sorting and Searching

Develop a program that analyzes a dynamic set of numbers entered by the user. Organize your program using methods, each performing a specific task.

---

## Program Requirements

1. Ask the user to enter the number of values they want to analyze.
2. Prompt the user to enter each number, storing them in an array.
3. Ask the user to enter a number to search in the array.
4. Analyze and display the results using separate methods for each task.

---

## Required Methods

### 1. `sortArray()`

- Sort the array in ascending order.
- Ensure that the sorting logic works for any number of elements.

### 2. `searchNumber()`

- Find all positions of the target number in the array.
- Handle the case where the number is not found.

### 3. `countOccurrences()`

- Count how many times the target number appears in the array.

---

## Example Output

```text
How many numbers will you enter? 7

Enter number 1: 4
Enter number 2: 2
Enter number 3: 7
Enter number 4: 4
Enter number 5: 9
Enter number 6: 2
Enter number 7: 4

Enter the number to search: 4

Sorted Array: 2, 2, 4, 4, 4, 7, 9
Number 4 found at position(s): 3, 4, 5
Occurrences: 3
```

---

## Expected Workflow

1. Read the number of elements.
2. Store all values in an array.
3. Sort the array using `sortArray()`.
4. Search for the target value using `searchNumber()`.
5. Count occurrences using `countOccurrences()`.
6. Display the sorted array, positions, and occurrence count.

---

## Sample Method Structure (Java)

```java
public static void sortArray(int[] numbers) {
    // sorting logic
}

public static void searchNumber(int[] numbers, int target) {
    // search logic
}

public static int countOccurrences(int[] numbers, int target) {
    // counting logic
}
```
