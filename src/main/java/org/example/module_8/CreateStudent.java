package org.example.module_8;

// step 1 - Import the packages
import java.sql.*;

public class CreateStudent {
    static final String DATABASE_URL = "jdbc:mysql://localhost/";
    static final String DATABASE_NAME = "college_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "root1234";

    public static void main(String[] args) throws SQLException {
        // step 2 - Open a connection
        Connection conn = DriverManager.getConnection(DATABASE_URL+DATABASE_NAME, USERNAME, PASSWORD);

        // step 3 - Execute a query
        Statement obj = conn.createStatement();
        String values = "(3, 'joe', 'joe@gmail.com', 22, 'cse')";
        String sqlQuery = "INSERT INTO students VALUES" + values;
        int row = obj.executeUpdate(sqlQuery);

        // step 4 - if executeUpdate function successfully called row count is greater then 0
        if(row==1) {
            System.out.println("Student record inserted.");
        }

        // step 5 - close connection
        conn.close();
    }
}
