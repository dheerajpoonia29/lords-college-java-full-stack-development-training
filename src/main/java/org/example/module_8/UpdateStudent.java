package org.example.module_8;

import java.sql.*;

public class UpdateStudent {

    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {

        // step 2 - Open connection
        Connection conn = DriverManager.getConnection(
                DATABASE_URL + DATABASE_NAME, USERNAME, PASSWORD
        );

        // step 3 - Update query
        String sql =
                "UPDATE students SET name = ?, email = ?, age = ?, department = ? " +
                        "WHERE student_id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        // set updated values
        pstmt.setString(1, "Rohit");
        pstmt.setString(2, "rohit12313@gmail.com");
        pstmt.setInt(3, 23);
        pstmt.setString(4, "ME");
        pstmt.setInt(5, 2);   // student_id to update

        int rowsUpdated = pstmt.executeUpdate();

        // step 4 - Check result
        if (rowsUpdated > 0) {
            System.out.println("Student updated successfully ✨");
        } else {
            System.out.println("No student found with given ID");
        }

        // step 5 - Close connection
        conn.close();
    }
}