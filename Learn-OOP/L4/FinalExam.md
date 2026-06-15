# Final Laboratory Exam: BSIT Enrollment System

## General Instructions

Apply Object-Oriented Programming concepts:
- Classes and Objects
- Encapsulation
- Inheritance
- Abstraction
- Polymorphism
- Arrays

Follow proper naming conventions and indentation. Your program must compile and run without errors.

---

## Project Requirements

**Project Name:** `BSIT_Enrollment_System`

### Package Structure

```
main
└── Main.java

models
├── Student.java
├── NewStudent.java
├── ExistingStudent.java
├── TransfereeStudent.java
└── Course.java

services
└── EnrollmentService.java
```

---

## Problem Description

Create a Java program that simulates a University Enrollment System. The system allows multiple students to enroll in courses based on their classification:
- **New Students** — auto-enrolled in first year subjects
- **Existing Students** — manual enrollment, all courses available
- **Transferee Students** — restricted to 1st–2nd year courses only

The system computes tuition fees, applies discounts, and generates a final report.

---

## Course Catalog (Pre-Defined)

The system contains the following courses:

| Code  | Course Name          | Units | Year Level |
|-------|----------------------|-------|------------|
| IT101 | Programming 1        | 3     | 1          |
| IT102 | Programming 2        | 3     | 1          |
| IT103 | Database Systems     | 4     | 1          |
| IT104 | Web Development      | 3     | 1          |
| IT201 | Data Structures      | 4     | 2          |
| IT202 | Networking           | 3     | 2          |
| IT301 | Software Engineering | 3     | 3          |
| IT401 | Capstone Project     | 6     | 4          |

---

## Class Requirements

### 1. Abstract Class: `Student`

**Attributes:**
- `name` (String)
- `id` (String)
- `gpa` (double)
- `yearLevel` (int)
- `courses` (Course[])
- `courseCount` (int)

**Methods:**
- Setters and getters
- `addCourse()`
- `getTotalUnits()`
- `computeTuition()`
- `computeDiscount()`
- `finalPayment()`
- `displayCourses()`
- `studentType()` *(abstract)*

---

### 2. `NewStudent` (extends `Student`)

**Methods:**
- Override `studentType()`

**Rule:** Automatically enrolled in all 1st year courses.

---

### 3. `ExistingStudent` (extends `Student`)

**Methods:**
- Override `studentType()`

**Rule:** Can enroll in ALL courses.

---

### 4. `TransfereeStudent` (extends `Student`)

**Methods:**
- Override `studentType()`

**Rules:**
- Can only enroll in 1st and 2nd year courses
- Cannot access IT301 and IT401
- Max units: 24

---

### 5. `Course` Class

**Attributes:**
- `courseCode` (String)
- `name` (String)
- `units` (int)
- `yearLevel` (int)

**Methods:**
- Constructor
- Getters only

---

### 6. `EnrollmentService` Class

**Methods:**
- `enroll()`

Handles course enrollment only. No computation inside `main`.

---

## Main Program Requirements

### Input

1. Ask the number of students.
2. For each student, ask:
   - Name
   - GPA
   - Student Type (`1` = New Student, `2` = Existing Student, `3` = Transferee Student)

---

## Enrollment Rules

**New Student:**
- Automatically enrolled in: `IT101, IT102, IT103, IT104`

**Existing Student:**
- Can view ALL courses
- Manually choose courses

**Transferee Student:**
- Can ONLY view `IT101` to `IT202`
- Manually choose courses
- Max units: 24

---

## Tuition Computation

- Each unit costs **₱1,500**
- Formula:
```
  Total Tuition = Total Units × ₱1,500
```

---

## Discount System

- If GPA is **95 or above**, the student receives:
  - **20% discount** on total tuition

---

## Output Format

For each student display:
- Name
- ID
- GPA
- Student Type
- Enrolled Courses
- Total Units
- Tuition
- Discount
- Final Payment

**Final Output:**
- Total revenue of all students

---

## Sample Output

```
Enter number of Students: 3

==========================
STUDENT 1
==========================
Name: Maria Clara Reyes
GPA: 96.8
[1] New Student
[2] Existing Student
[3] Transferee Student
Type: 1

Auto-enrolling 1st year courses...
Added: IT101
Added: IT102
Added: IT103
Added: IT104

==========================
STUDENT SUMMARY
==========================
Name: Maria Clara Reyes
ID: BSIT - 1001
GPA: 96.8
Type: New Student

COURSES:
- IT101 Programming 1 (3)
- IT102 Programming 2 (3)
- IT103 Database Systems (4)
- IT104 Web Development (3)

Total Units: 13
Tuition: 19500.0
Discount: 3900.0
Final Payment: 15600.0

==========================
STUDENT 2
==========================
Name: David Paul Mendoza
GPA: 89.5
[1] New Student
[2] Existing Student
[3] Transferee Student
Type: 2
Year Level (2-4): 3

AVAILABLE COURSES:
IT101 - Programming 1 (3 units)
IT102 - Programming 2 (3 units)
IT103 - Database Systems (4 units)
IT104 - Web Development (3 units)
IT201 - Data Structures (4 units)
IT202 - Networking (3 units)
IT301 - Software Engineering (3 units)
IT401 - Capstone Project (6 units)
Enter course code (DONE to stop): IT103
Enrolled: IT103 - Database Systems
Enter course code (DONE to stop): IT201
Enrolled: IT201 - Data Structures
Enter course code (DONE to stop): IT301
Enrolled: IT301 - Software Engineering
Enter course code (DONE to stop): DONE

==========================
STUDENT SUMMARY
==========================
Name: David Paul Mendoza
ID: BSIT - 1002
GPA: 89.5
Type: Existing Student

COURSES:
- IT103 Database Systems (4)
- IT201 Data Structures (4)
- IT301 Software Engineering (3)

Total Units: 11
Tuition: 16500.0
Discount: 0.0
Final Payment: 16500.0

==========================
STUDENT 3
==========================
Name: Sarah Jane Lopez
GPA: 90.0
[1] New Student
[2] Existing Student
[3] Transferee Student
Type: 3

AVAILABLE COURSES (TRANSFEREE ONLY):
IT101 - Programming 1 (3 units)
IT102 - Programming 2 (3 units)
IT103 - Database Systems (4 units)
IT104 - Web Development (3 units)
IT201 - Data Structures (4 units)
IT202 - Networking (3 units)
Enter course code (DONE to stop): IT104
Enrolled: IT104 - Web Development
Enter course code (DONE to stop): IT202
Enrolled: IT202 - Networking
Enter course code (DONE to stop): IT201
Enrolled: IT201 - Data Structures
Enter course code (DONE to stop): DONE

==========================
STUDENT SUMMARY
==========================
Name: Sarah Jane Lopez
ID: BSIT - 1003
GPA: 90.0
Type: Transferee Student

COURSES:
- IT104 Web Development (3)
- IT202 Networking (3)
- IT201 Data Structures (4)

Total Units: 10
Tuition: 15000.0
Discount: 0.0
Final Payment: 15000.0

==========================
FINAL REPORT
==========================
Maria Clara Reyes → ₱15600.0
David Paul Mendoza → ₱16500.0
Sarah Jane Lopez → ₱15000.0

TOTAL REVENUE: ₱47100.0
```