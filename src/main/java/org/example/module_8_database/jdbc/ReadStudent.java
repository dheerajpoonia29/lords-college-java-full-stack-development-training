package org.example.module_8_database.jdbc;

// step 1 - Import the packages
import java.sql.*;

public class ReadStudent {
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
        String sqlQuery = "SELECT * FROM students";
        ResultSet data = obj.executeQuery(sqlQuery);

        // step 4 - Extract data from result set
        while (data.next()) {
            System.out.println(data.getInt("student_id") +" - " + data.getString("name") +
                    " - " + data.getString("email") + " - " + data.getInt("age") + " - " + data.getString("department"));
        }

        // step 5 - close connection
        conn.close();
    }
}
