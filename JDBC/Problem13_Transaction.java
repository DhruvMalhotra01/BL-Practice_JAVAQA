package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Problem13_Transaction {

    public static void main(String[] args) {

        int fromAccount = 1;
        int toAccount = 2;
        double amount = 2000;

        String withdrawSQL =
                "UPDATE BankAccount "
                + "SET balance = balance - ? "
                + "WHERE account_id = ?";

        String depositSQL =
                "UPDATE BankAccount "
                + "SET balance = balance + ? "
                + "WHERE account_id = ?";

        try (Connection connection =
                     DBConnection.getConnection()) {

            try {

                // Start transaction
                connection.setAutoCommit(false);

                try (PreparedStatement withdraw =
                             connection.prepareStatement(
                                     withdrawSQL);

                     PreparedStatement deposit =
                             connection.prepareStatement(
                                     depositSQL)) {

                    // Withdraw
                    withdraw.setDouble(1, amount);
                    withdraw.setInt(2, fromAccount);

                    int withdrawn =
                            withdraw.executeUpdate();

                    if (withdrawn != 1) {
                        throw new Exception(
                                "Withdrawal failed"
                        );
                    }

                    // Deposit
                    deposit.setDouble(1, amount);
                    deposit.setInt(2, toAccount);

                    int deposited =
                            deposit.executeUpdate();

                    if (deposited != 1) {
                        throw new Exception(
                                "Deposit failed"
                        );
                    }

                    // Everything successful
                    connection.commit();

                    System.out.println(
                            "Transaction successful"
                    );
                }

            } catch (Exception e) {

                connection.rollback();

                System.out.println(
                        "Transaction failed. Rolled back."
                );

                System.out.println(
                        e.getMessage()
                );
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}