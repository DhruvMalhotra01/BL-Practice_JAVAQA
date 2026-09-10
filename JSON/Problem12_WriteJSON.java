package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Problem12_WriteJSON {

    public static void main(String[] args) {

        Book book =
                new Book(
                        "Java Basics",
                        "R. Sharma",
                        499
                );


        ObjectMapper mapper =
                new ObjectMapper();


        try {

            mapper.writeValue(
                    new File("JSON/book.json"),
                    book
            );


            System.out.println(
                    "JSON file created successfully."
            );

        }
        catch (IOException e) {

            System.out.println(
                    "Error writing JSON: "
                            + e.getMessage()
            );
        }
    }
}
