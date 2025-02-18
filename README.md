# MTBS
# Movie Ticket Booking System (MTBS)

## Introduction

The **Movie Ticket Booking System (MTBS)** is a Java-based application designed to simulate the movie ticket booking process. It allows users to browse available movies, book tickets, and manage reservations. Additionally, it provides administrators with functionalities to add and manage movie listings, showtimes, theaters, and bookings.

This project uses **MySQL** as the database system to store movie details, user information, and booking records. The application communicates with the MySQL database using **JDBC (Java Database Connectivity)**.

---

## Steps to Follow

### 1. Install MySQL Workbench
Make sure **MySQL Workbench** is installed on your system for managing the MySQL database.

### 2. Clone the Repository
Clone the repository as it is to your local machine.

### 3. Open Code Editor
Open **VS Code** or any other code editor where you can run Java files.

### 4. Set Up the Database
- Create the database and tables by using the SQL queries in the `mysql_setup.txt` file. 
- Copy and paste the queries one by one into MySQL Workbench to set up the required database structure.

**Note:** Update your database credentials in the `DatabaseOperation.java` file:
```java
static final String DB_URL = "jdbc:mysql://localhost:3306/mtbs";
static final String USER = "your_username";
static final String PASS = "your_password";

5. Compile the java files by using commands given in "commands.txt" and Run the Code.

Description:
The Movie Ticket Booking System (MTBS) is a Java-based application designed to facilitate the booking of movie tickets. This system is created to simulate a real-world movie ticket booking experience, allowing users to browse movies, book tickets, and manage their reservations, while also providing a platform for administrators to add or manage movie listings.
The application leverages Java for the core business logic and MySQL as the database to store movie details, user information, and booking records. To connect the application to the database, we use JDBC (Java Database Connectivity), which enables seamless communication between the Java application and MySQL.

Key Features of the System:

1. Roles:
User: Users can log in, view available movies, and book tickets.
Admin: Admins have separate login credentials and access to manage the movie database, showtimes, theaters, and bookings.

2. Movie Management:

View: Both users and admins can view available movies.
Create: Admins have the ability to add new movies to the system.

3. ShowTime Management:

View: Users and admins can view available showtimes for movies.
Create: Admins can add new showtimes for movies.

4. Theater Management:

View: Users and admins can view theater information, including screens and available seats.
Create: Admins can create new theaters and define screen layouts and seat arrangements.

5. Booking Management:

Check: Users can check their current bookings.
Cancel: Users have the ability to cancel their bookings if needed.
