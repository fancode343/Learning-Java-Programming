# 🎬 Laboratory Activity: Movie & Cinema

## Instructions

Create two classes: **Movie** and **Cinema**.

---

## Class: Movie

### Attributes (Fields)

- `String title`
- `int duration` *(in minutes)*
- `double ticketPrice`

### Method

#### `displayInfo()`

- Print the movie details.

---

## Class: Cinema

### Method

#### `calculateCost(Movie m, int tickets)`

- Accepts a `Movie` object and the number of tickets.
- Returns the total cost.

#### `isLongMovie(Movie m)`

- Accepts a `Movie` object.
- Returns `true` if the movie duration is greater than **120 minutes**.

---

## Main Class

Create a **Main** class with a `main()` method that:

1. Creates two `Movie` objects.
2. Creates one `Cinema` object.
3. Displays each movie's information.
4. Calls `calculateCost()` for each movie.
5. Calls `isLongMovie()` for each movie.

---

## Expected Output

```text
Title: Avengers
Duration: 150 minutes
Ticket Price: 300.0
Total Cost (2 tickets): 600.0
Long Movie? true

Title: Frozen
Duration: 100 minutes
Ticket Price: 250.0
Total Cost (2 tickets): 500.0
Long Movie? false
```