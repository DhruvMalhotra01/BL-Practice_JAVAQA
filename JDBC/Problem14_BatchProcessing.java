package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Problem14_BatchProcessing {

    public static void main(String[] args) {

        String sql =
                "INSERT INTO Employee "
                + "(name, department_id, salary) "
                + "VALUES (?, ?, ?)";

        try (Connection connection =
                     DBConnection.getConnection();

             PreparedStatement statement =
                     connection.prepareStatement(sql)) {

            // Employee 1
            statement.setString(1, "Ravi");
            statement.setInt(2, 101);
            statement.setDouble(3, 50000);
            statement.addBatch();

            // Employee 2
            statement.setString(1, "Simran");
            statement.setInt(2, 102);
            statement.setDouble(3, 55000);
            statement.addBatch();

            // Employee 3
            statement.setString(1, "Karan");
            statement.setInt(2, 103);
            statement.setDouble(3, 60000);
            statement.addBatch();

            // Execute all
            int[] results =
                    statement.executeBatch();

            System.out.println(
                    "Records processed: "
                    + results.length
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
