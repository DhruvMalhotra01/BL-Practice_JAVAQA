public class DatabaseService {

    void connect() {

        System.out.println("Database connected");
    }

    void disconnect() {

        System.out.println("Database disconnected");
    }

    boolean isUserAvailable(String username) {

        return username.equals("Dhruv");
    }
}