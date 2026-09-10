package IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Problem04_ByteArrayStream {

    public static void main(String[] args) {

        String message =
                "Java ByteArray Streams";


        try {

            // Creates an output stream in memory
            ByteArrayOutputStream output =
                    new ByteArrayOutputStream();


            output.write(
                    message.getBytes(StandardCharsets.UTF_8)
            );


            // Get the data as a byte array
            byte[] data = output.toByteArray();


            // Read the same data from memory
            ByteArrayInputStream input =
                    new ByteArrayInputStream(data);


            int value;

            System.out.println("Data from memory:");

            while ((value = input.read()) != -1) {

                System.out.print((char) value);
            }


            output.close();
            input.close();

        }
        catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
