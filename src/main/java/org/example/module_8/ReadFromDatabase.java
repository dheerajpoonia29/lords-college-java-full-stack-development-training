package org.example.module_8;

// step 1 - Import the packages
import java.sql.*;

public class ReadFromDatabase {
    // Constant
    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";


    public static void main(String[] args) throws SQLException {
        // step 2 - Open a connection
        Connection conn = DriverManager.getConnection(DATABASE_URL+DATABASE_NAME, USERNAME, PASSWORD);

        // step 3 - Execute a query
        Statement obj = conn.createStatement();
        ResultSet data = obj.executeQuery("SELECT * FROM students");

        // step 4 - Extract data from result set
        while (data.next()) {
            System.out.println(data.getInt("student_id") +" - " + data.getString("name") +
                    " - " + data.getString("email") + " - " + data.getInt("age") + " - " + data.getString("department"));
        }

        // step 5 - close connection
        conn.close();
    }
}
