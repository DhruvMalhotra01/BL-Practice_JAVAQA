package JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Problem09_SQLInjection {
    String sql =
        "SELECT * FROM Employee "
        + "WHERE name = ?";

PreparedStatement statement =
        connection.prepareStatement(sql);

statement.setString(1, name);

ResultSet result =
        statement.executeQuery();
}
