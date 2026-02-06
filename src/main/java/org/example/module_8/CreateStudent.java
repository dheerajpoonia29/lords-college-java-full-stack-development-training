package org.example.module_8;

// step 1 - Import the packages
import java.sql.*;

public class CreateStudent {
    // Constants
    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {

        // step 2 - Open a connection
        Connection conn = DriverManager.getConnection(
                DATABASE_URL + DATABASE_NAME, USERNAME, PASSWORD
        );

        // step 3 - Execute insert query
        Statement obj = conn.createStatement();

        String insertQuery =
                "INSERT INTO students (student_id, name, email, age, department) " +
                        "VALUES (6, 'Rahul', 'rahul1@gmail.com', 21, 'CSE')";

        int rowsInserted = obj.executeUpdate(insertQuery);

        // step 4 - Check result
        if (rowsInserted > 0) {
            System.out.println("Student inserted successfully ✅");
        }

        // step 5 - Close connection
        conn.close();
    }
}