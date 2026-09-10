package JSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Set;

// Imports depend on the version of the JSON Schema library.
// For networknt JSON Schema Validator:

import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class Problem16_JSONSchemaValidation {

    public static void main(String[] args) {

        ObjectMapper mapper =
                new ObjectMapper();


        try {

            // Read the JSON document
            JsonNode student =
                    mapper.readTree(
                            new File("JSON/student.json")
                    );


            // Read the schema
            JsonNode schemaNode =
                    mapper.readTree(
                            new File("JSON/student-schema.json")
                    );


            JsonSchemaFactory factory =
                    JsonSchemaFactory.getInstance(
                            SpecVersion.VersionFlag.V202012
                    );


            JsonSchema schema =
                    factory.getSchema(schemaNode);


            Set<ValidationMessage> errors =
                    schema.validate(student);


            if (errors.isEmpty()) {

                System.out.println(
                        "JSON is valid according to the schema."
                );

            } else {

                System.out.println(
                        "JSON validation failed:"
                );


                for (ValidationMessage error : errors) {

                    System.out.println(
                            "- " + error.getMessage()
                    );
                }
            }

        }
        catch (Exception e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
