package org.example.module_8;

// step 1 - Import the packages
import java.sql.*;

public class UpdateStudent {
    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {
        // step 2 - Open a connection
        Connection conn = DriverManager.getConnection(DATABASE_URL+DATABASE_NAME, USERNAME, PASSWORD);

        // step 3 - Execute a query
        String sqlQuery = "UPDATE students SET name = ?, email = ?, age = ?, department = ? WHERE student_id = ?";
        PreparedStatement obj = conn.prepareStatement(sqlQuery);
        obj.setString(1, "mohit");
        obj.setString(2, "mohit@gmail.com");
        obj.setInt(3, 55);
        obj.setString(4, "it");
        obj.setInt(5, 2);

        int updatedRow = obj.executeUpdate();

        // step 4 - if executeUpdate function successfully called row count is greater then 0
        if(updatedRow==1) {
            System.out.println("Student record updated.");
        }

        // step 5 - close connection
        conn.close();
    }
}
