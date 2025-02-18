# MTBS
Movie Ticket Booking System
MTBS Assignment - Movie Ticket Booking System
This project is a Movie Ticket Booking System (MTBS) that demonstrates basic functionalities such as booking movie tickets, user authentication, and managing movie information through a MySQL database.

Steps to Follow:
1. Required MySQL Workbench installed in your system
2  Clone the Repository as it is.
3. Open VS Code or Any code editor where you can run java files
4. Create a database and tables using file "mysql_setup.txt" and run the queries just by copy pasting from that text file one by one.
Note: Update the {database_name , user_name, user_password} in file "DatabaseOperation.java"
    for example: 
                 static final String DB_URL = "jdbc:mysql://localhost:3306/mtbs";
                 static final String USER = "root";
                 static final String PASS = "pankaj67";
    here my database_name = mtbs , user_name = root , user_password = pankaj67
    update it to
                 static final String DB_URL = "jdbc:mysql://localhost:3306/mtbs";
                 static final String USER = "your_username";
                 static final String PASS = "your_password";
    so that the running files can access the database

    Tip: All SQL queries are listed in file "mysql_Setup.txt" so that you can easily setup the database required for this project.

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
