package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Problem07_PreparedInsert {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO Employee "
                + "(name, department_id, salary) "
                + "VALUES (?, ?, ?)";

        try (Connection connection =
                     DBConnection.getConnection();

             PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            statement.setString(1, "Riya");
            statement.setInt(2, 101);
            statement.setDouble(3, 55000);

            int rows =
                    statement.executeUpdate();

            System.out.println(
                    rows + " row inserted successfully"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}