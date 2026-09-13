package JDBC;

import java.sql.*;

public class Problem12_CallableStatement {

    public static void main(String[] args) {

        String sql =
                "{call GetEmployeesByDepartment(?)}";

        try (Connection connection =
                     DBConnection.getConnection();

             CallableStatement statement =
                     connection.prepareCall(sql)) {

            statement.setString(1, "Sales");

            ResultSet result =
                    statement.executeQuery();

            while (result.next()) {

                int id =
                        result.getInt("id");

                String name =
                        result.getString("name");

                double salary =
                        result.getDouble("salary");

                System.out.println(
                        id + " | "
                        + name + " | "
                        + salary
                );
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}