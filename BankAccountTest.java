import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;


    @BeforeEach
    void setUp() {

        account = new BankAccount();

        account.deposit(1000);

        System.out.println("Account created");
    }


    @Test
    void testBalance() {

        assertEquals(1000, account.getBalance());
    }


    @Test
    void testDeposit() {

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }


    @AfterEach
    void tearDown() {

        account.reset();

        System.out.println("Account reset");
    }
}