package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Problem05_Connection {

    public static void main(String[] args) {

        String url =
                "jdbc:mysql://localhost:3306/CompanyDB";

        String username = "root";
        String password = "your_password";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println(
                    "Connected to the database successfully"
            );

            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Database connection failed: "
                    + e.getMessage()
            );
        }
    }
}