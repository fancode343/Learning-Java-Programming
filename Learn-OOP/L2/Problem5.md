# 🎬 Laboratory Activity: Movie System (OOP Concepts)

## Objective

In this activity, students will apply the following OOP concepts:

- Classes and Objects
- Encapsulation (private attributes, getters, and setters)
- Inheritance (`extends`)
- `this` keyword
- `super` keyword
- Array of Objects

---

# Part 1: Create the Base Class (Show)

## Instructions

1. Create a class named **Show**.
2. Declare the following private attributes:
   - `String title`
   - `int duration`
3. Create a constructor that initializes all attributes using the **this** keyword.
4. Create getter and setter methods for all attributes.
5. Create a method:

### `displayInfo()`

- Prints the title and duration.

---

# Part 2: Create the Derived Class (Movie)

## Instructions

1. Create a class named **Movie** that extends **Show**.
2. Add the following private attribute:
   - `String genre`
3. Create a constructor that:
   - Uses **super** to initialize `title` and `duration`
   - Uses **this** to initialize `genre`
4. Create getter and setter methods for `genre`.
5. Override the method:

### `displayInfo()`

- Call `super.displayInfo()` first.
- Then display the genre.

---

# Part 3: Main Class (User Input System)

## Instructions

1. Create a class named **Main**.
2. Ask the user:

```text
Enter number of movies:
```

3. Create an array of Movie objects based on the user's input.

```java
Movie[] movies = new Movie[n];
```

4. Use a loop to input the following details for each movie:

   - Title
   - Duration (in minutes)
   - Genre
   - Ticket Price

5. Create each Movie object using the constructor and store it in the array.

6. After all input is completed, use another loop to display all movie details using:

```java
displayInfo();
```

---

# Sample Output

```text
Enter number of movies: 2

Movie 1
Title: Avengers
Duration: 180
Genre: Action

Movie 2
Title: Frozen
Duration: 120
Genre: Animation

--- MOVIE DETAILS ---

Title: Avengers
Duration: 180 minutes
Genre: Action

Title: Frozen
Duration: 120 minutes
Genre: Animation
```

---

# OOP Concepts Applied

| Concept | Description |
|----------|-------------|
| Classes and Objects | Creating `Show` and `Movie` objects |
| Encapsulation | Using private attributes with getters and setters |
| Inheritance | `Movie` inherits from `Show` |
| `this` Keyword | Refers to the current object's attributes |
| `super` Keyword | Calls the parent class constructor and methods |
| Method Overriding | `Movie` overrides `displayInfo()` |
| Array of Objects | Stores multiple `Movie` objects in an array |

---

# Expected Class Structure

```text
Show
├── title
├── duration
└── displayInfo()

Movie extends Show
├── genre
└── displayInfo()

Main
└── Movie[] movies
```