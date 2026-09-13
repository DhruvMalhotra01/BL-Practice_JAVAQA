package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Problem08_UpdateDelete {

    public static void main(String[] args) {

        try (Connection connection =
                     DBConnection.getConnection()) {

            String updateSQL =
                    "UPDATE Employee "
                    + "SET salary = ? "
                    + "WHERE id = ?";

            try (PreparedStatement statement =
                         connection.prepareStatement(updateSQL)) {

                statement.setDouble(1, 80000);
                statement.setInt(2, 1);

                int rows =
                        statement.executeUpdate();

                System.out.println(
                        "Updated rows: " + rows
                );
            }

            String deleteSQL =
                    "DELETE FROM Employee "
                    + "WHERE id = ?";

            try (PreparedStatement statement =
                         connection.prepareStatement(deleteSQL)) {

                statement.setInt(1, 5);

                int rows =
                        statement.executeUpdate();

                System.out.println(
                        "Deleted rows: " + rows
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}