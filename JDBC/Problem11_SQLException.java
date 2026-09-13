package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Problem11_SQLException {

    public static void main(String[] args) {

        String url =
                "jdbc:mysql://localhost:3306/WrongDatabase";

        String username = "root";
        String password = "wrongPassword";

        try {

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println("Connected!");

            connection.close();

        } catch (SQLException e) {

            System.out.println(
                    "Database connection failed."
            );

            System.out.println(
                    "Error message: "
                    + e.getMessage()
            );

            System.out.println(
                    "Error code: "
                    + e.getErrorCode()
            );

            System.out.println(
                    "SQL state: "
                    + e.getSQLState()
            );
        }
    }
}