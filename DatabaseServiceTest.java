import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseServiceTest {

    static DatabaseService database;


    @BeforeAll
    static void setUpDatabase() {

        database = new DatabaseService();

        database.connect();
    }


    @Test
    void testUserExists() {

        assertTrue(database.isUserAvailable("Dhruv"));
    }


    @Test
    void testAnotherUser() {

        assertTrue(database.isUserAvailable("Dhruv"));
    }


    @AfterAll
    static void closeDatabase() {

        database.disconnect();
    }
}