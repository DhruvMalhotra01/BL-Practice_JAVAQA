package JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Problem13_ReadJSON {

    public static void main(String[] args) {

        ObjectMapper mapper =
                new ObjectMapper();


        try {

            JsonNode student =
                    mapper.readTree(
                            new File("JSON/student.json")
                    );


            System.out.println(
                    "Name: "
                            + student.get("name").asText()
            );


            System.out.println(
                    "Age: "
                            + student.get("age").asInt()
            );


            System.out.println(
                    "Marks: "
                            + student.get("marks").asDouble()
            );

        }
        catch (IOException e) {

            System.out.println(
                    "Error reading JSON: "
                            + e.getMessage()
            );
        }
    }
}
