package JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Problem15_ObjectToJSON {

    public static void main(String[] args) {

        ObjectMapper mapper =
                new ObjectMapper();


        try {

            // Java object
            Book original =
                    new Book(
                            "Java Basics",
                            "R. Sharma",
                            499
                    );


            // Object → JSON
            String json =
                    mapper.writeValueAsString(original);


            System.out.println(
                    "JSON: " + json
            );


            // JSON → Object
            Book converted =
                    mapper.readValue(
                            json,
                            Book.class
                    );


            System.out.println(
                    "\nConverted object:"
            );

            System.out.println(
                    "Title: "
                            + converted.getTitle()
            );

            System.out.println(
                    "Author: "
                            + converted.getAuthor()
            );

            System.out.println(
                    "Price: "
                            + converted.getPrice()
            );

        }
        catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
