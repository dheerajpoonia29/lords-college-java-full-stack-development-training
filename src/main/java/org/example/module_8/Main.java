package org.example.module_8;

// import package
import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:mysql://localhost/lords_college";
    static final String USER = "root";
    static final String PASS = "root1234";
    static final String QUERY = "SELECT * FROM teacher";

    public static void main(String[] args) {

        try{
            // Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            // execute query
            ResultSet rs = stmt.executeQuery(QUERY);
            // Extract data from result set
            while (rs.next()) {
                System.out.print("id: " + rs.getInt("id"));
                System.out.print(", name: " + rs.getString("name"));
                System.out.print(", number: " + rs.getInt("number"));
                System.out.println();
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
