// Q18: Write a program to generate SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLGen {
    public static void main(String[] args) {
        try {
            // This will throw SQLException if no proper URL is provided
            Connection conn = DriverManager.getConnection("jdbc:invalid:url");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}
