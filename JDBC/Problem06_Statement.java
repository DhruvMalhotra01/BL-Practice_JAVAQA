package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Problem06_Statement {

    public static void main(String[] args) {

        String query =
                "SELECT id, name, department_id, salary "
                + "FROM Employee";

        try (Connection connection =
                     DBConnection.getConnection();

             Statement statement =
                     connection.createStatement();

             ResultSet result =
                     statement.executeQuery(query)) {

            while (result.next()) {

                int id = result.getInt("id");
                String name = result.getString("name");
                int department =
                        result.getInt("department_id");
                double salary =
                        result.getDouble("salary");

                System.out.println(
                        id + " | "
                        + name + " | "
                        + department + " | "
                        + salary
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
