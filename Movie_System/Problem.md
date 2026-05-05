Laboratory Activity: Movie System (OOP Concepts)
Objective
In this activity, students will apply the following OOP concepts:
● Classes and Objects
● Encapsulation (private attributes, getters and setters)
● Inheritance (extends)
● this keyword
● super keyword
● Array of Objects
Instructions
Part 1: Create the Base Class (Show)

1. Create a class named Show.
2. Declare the following private attributes:
   ○ title (String)
   ○ duration (int)
3. Create a constructor that initializes all attributes using the this keyword.
4. Create getter and setter methods for all attributes.
5. Create a method:
   ○ displayInfo() → prints title and duration.

Part 2: Create the Derived Class (Movie)

1. Create a class named Movie that extends Show.
2. Add the following private attribute:
   ○ genre (String)
3. Create a constructor that:
   ○ Uses super to initialize title and duration
   ○ Uses this to initialize genre
4. Create getter and setter for genre.
5. Override the method:
   ○ displayInfo()
   ○ Call super.displayInfo() first
   ○ Then display the genre
   Part 3: Main Class (User Input System)
6. Create a class named Main.
7. Ask the user:
   ○ “Enter number of movies”

Create an array of Movie objects based on the input:
Movie[] movies = new Movie[n]; 3. Use a loop to input the following details for each movie:
○ Title
○ Duration (in minutes)
○ Genre
○ TicketPrice 4. Create each Movie object using the constructor and store it in the array.
After input, use another loop to display all movie details using: displayInfo()

Sample Output
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
