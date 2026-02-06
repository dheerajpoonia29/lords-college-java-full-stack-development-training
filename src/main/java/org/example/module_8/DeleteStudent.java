package org.example.module_8;

import java.sql.*;

public class DeleteStudent {

    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {

        // step 2 - Open connection
        Connection conn = DriverManager.getConnection(
                DATABASE_URL + DATABASE_NAME, USERNAME, PASSWORD
        );

        // step 3 - Delete query
        String sql = "DELETE FROM students WHERE student_id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        // set student_id to delete
        pstmt.setInt(1, 4);   // change id as needed

        int rowsDeleted = pstmt.executeUpdate();

        // step 4 - Check result
        if (rowsDeleted > 0) {
            System.out.println("Student deleted successfully ❌");
        } else {
            System.out.println("No student found with given ID");
        }

        // step 5 - Close connection
        conn.close();
    }
}