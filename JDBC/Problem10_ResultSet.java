package JDBC;

import java.sql.*;

public class Problem10_ResultSet {

    public static void main(String[] args) {

        String sql =
                "SELECT id, name, department_id, salary "
                + "FROM Employee";

        try (Connection connection =
                     DBConnection.getConnection();

             Statement statement =
                     connection.createStatement();

             ResultSet result =
                     statement.executeQuery(sql)) {

            while (result.next()) {

                // Using column names
                int id =
                        result.getInt("id");

                String name =
                        result.getString("name");

                // Using column indexes
                int department =
                        result.getInt(3);

                double salary =
                        result.getDouble(4);

                System.out.println(
                        id + " "
                        + name + " "
                        + department + " "
                        + salary
                );
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}