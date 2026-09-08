import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BankAccountExceptionTest {

    @Test
    void testWithdrawWithInsufficientBalance() {

        BankAccount account = new BankAccount(5000);

        assertThrows(
                InsufficientBalanceException.class,
                () -> account.withdraw(7000)
        );
    }
}