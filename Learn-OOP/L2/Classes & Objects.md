# ☕ Java Classes and Objects

## Introduction

Java is an **Object-Oriented Programming (OOP)** language. Everything in Java revolves around **classes** and **objects**.

- A **class** is a blueprint or template for creating objects.
- An **object** is an instance of a class.

Think of it this way:

| Real Life Example | Java Concept |
|------------------|-------------|
| House Blueprint | Class |
| Actual House | Object |
| Car Design | Class |
| Specific Car | Object |

---

# 📦 What is a Class?

A **class** is a user-defined data type that contains:

- Fields (Variables)
- Methods (Functions)
- Constructors

### Syntax

```java
class ClassName {

    // Fields (Attributes)
    dataType variableName;

    // Methods (Behaviors)
    void methodName() {

    }
}
```

### Example

```java
class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

In this example:

- `Student` → Class
- `name` and `age` → Fields
- `displayInfo()` → Method

---

# 🎯 What is an Object?

An **object** is an instance of a class.

Objects allow us to use the variables and methods defined inside a class.

### Creating an Object

```java
ClassName objectName = new ClassName();
```

### Example

```java
Student student1 = new Student();
```

Here:

- `Student` → Class Name
- `student1` → Object Name
- `new` → Creates a new object

---

# 🏗️ Class and Object Example

```java
class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "John";
        student1.age = 18;

        student1.displayInfo();
    }
}
```

### Output

```text
Name: John
Age: 18
```

---

# 📋 Fields (Attributes)

Fields are variables declared inside a class.

### Example

```java
class Car {

    String brand;
    String color;
    int year;
}
```

### Fields

| Field | Data Type |
|---------|-----------|
| brand | String |
| color | String |
| year | int |

---

# ⚙️ Methods (Behaviors)

Methods define what an object can do.

### Example

```java
class Car {

    void startEngine() {
        System.out.println("Engine Started");
    }
}
```

### Calling a Method

```java
Car myCar = new Car();

myCar.startEngine();
```

### Output

```text
Engine Started
```

---

# 🏗️ Constructors

A constructor is a special method used to initialize objects.

### Characteristics

- Has the same name as the class.
- Has no return type.
- Automatically called when an object is created.

### Example

```java
class Student {

    Student() {
        System.out.println("Student Created");
    }
}
```

### Creating an Object

```java
Student s1 = new Student();
```

### Output

```text
Student Created
```

---

# 🔄 Multiple Objects

One class can create many objects.

### Example

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

Each object has its own data.

```java
s1.name = "John";
s2.name = "Mary";
s3.name = "Alex";
```

---

# 📌 Class vs Object

| Class | Object |
|---------|---------|
| Blueprint | Actual Instance |
| Logical Entity | Physical Entity |
| Does not occupy memory until object creation | Occupies memory |
| Defined once | Can be created many times |

### Example

```java
Class: Student

Objects:
- student1
- student2
- student3
```

---

# 🎨 Real-World Example

### Class

```java
class Dog {

    String breed;
    int age;

    void bark() {
        System.out.println("Woof!");
    }
}
```

### Objects

```java
Dog dog1 = new Dog();
Dog dog2 = new Dog();

dog1.breed = "Labrador";
dog2.breed = "German Shepherd";
```

---

# 🚀 Benefits of Using Classes and Objects

✅ Code Reusability

✅ Better Organization

✅ Easier Maintenance

✅ Supports Object-Oriented Programming

✅ Models Real-World Entities

---

# 📝 Key Terms

| Term | Meaning |
|--------|---------|
| Class | Blueprint for creating objects |
| Object | Instance of a class |
| Field | Variable inside a class |
| Method | Function inside a class |
| Constructor | Special method used to initialize objects |
| Instance | Another term for object |

---

# 🎯 Summary

- A **class** is a blueprint that defines properties and behaviors.
- An **object** is an instance of a class.
- Fields store data.
- Methods define actions.
- Constructors initialize objects.
- One class can create multiple objects.

### Formula to Remember

```text
Class + new Keyword = Object
```

### Example

```java
Student student1 = new Student();
```

Where:

- `Student` → Class
- `student1` → Object
- `new Student()` → Creates the object