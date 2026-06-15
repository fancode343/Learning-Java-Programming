# Prelim Laboratory Exam: Mode and Median Finder

Develop a program that analyzes a dynamic set of numbers entered by the user. Organize your program using methods to calculate the mode(s) and median.

---

## Program Requirements

1. Ask the user how many numbers they want to enter.
2. Allow the user to input `n` numbers.
3. Analyze the numbers using separate methods:
   - Determine the mode(s) of the numbers.
   - Determine the median of the numbers.
4. Display the results clearly, including:
   - All mode values if there are multiple.
   - The median value.

---

## Method Guidelines

- **`findMode`**
  - Identify the number(s) that appear most frequently.
  - If multiple numbers share the highest frequency, include all of them.

- **`findMedian`**
  - Determine the middle value of the array after sorting.
  - If there is an even number of elements, calculate the average of the two middle numbers.

---

## Example Output

**Single mode:**

```
How many numbers will you enter? 7

Enter number 1: 4
Enter number 2: 6
Enter number 3: 2
Enter number 4: 6
Enter number 5: 3
Enter number 6: 2
Enter number 7: 6

Mode(s): 6 (occurs 3 times)
Median: 4
```

**Multiple modes:**

```
How many numbers will you enter? 6

Enter number 1: 5
Enter number 2: 3
Enter number 3: 5
Enter number 4: 3
Enter number 5: 7
Enter number 6: 9

Mode(s): 3, 5 (occurs 2 times)
Median: 5
```

---

## Notes

- If there are multiple modes, all of them must be displayed.
- If the number of inputs is even, calculate the median as the average of the two middle numbers after sorting.
- Organize your program so it can handle any number of input values.