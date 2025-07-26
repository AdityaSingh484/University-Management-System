package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {

    Connection connection;
    Statement statement;

    public connect() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement", "root", "Aditya12345#");
            // Create the statement object
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
