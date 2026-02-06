package org.example.module_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {
        // step 2 - Open a connection
        Connection conn = DriverManager.getConnection(DATABASE_URL+DATABASE_NAME, USERNAME, PASSWORD);

        // step 3 - Execute a query
        String sqlQuery = "DELETE FROM students WHERE student_id = ?";
        PreparedStatement obj = conn.prepareStatement(sqlQuery);
        obj.setInt(1, 3);

        int updatedRow = obj.executeUpdate();

        // step 4 - if executeUpdate function successfully called row count is greater then 0
        if(updatedRow==1) {
            System.out.println("Student record deleted.");
        }

        // step 5 - close connection
        conn.close();
    }
}
