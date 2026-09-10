package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem02_BufferedReaderWriter {

    public static void main(String[] args) {

        String fileName = "buffered.txt";


        // Buffered writing
        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(fileName))) {

            writer.write("Java is easy to learn.");
            writer.newLine();

            writer.write("Buffered streams improve I/O efficiency.");
            writer.newLine();

            writer.write("They reduce direct interaction with the file.");

            System.out.println(
                    "Data written successfully."
            );
        }
        catch (IOException e) {

            System.out.println(
                    "Writing error: " + e.getMessage()
            );
        }


        // Buffered reading
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;

            System.out.println("\nFile contents:");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
        }
        catch (IOException e) {

            System.out.println(
                    "Reading error: " + e.getMessage()
            );
        }
    }
}
