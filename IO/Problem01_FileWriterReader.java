package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem01_FileWriterReader {

    public static void main(String[] args) {

        String fileName = "notes.txt";

        // Writing data into the file
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Hello, Java!\n");
            writer.write("I am learning File Handling.\n");
            writer.write("FileWriter is used to write characters.");

            System.out.println("Data written successfully.");

        }
        catch (IOException e) {

            System.out.println(
                    "Error while writing file: "
                            + e.getMessage()
            );
        }


        // Reading data from the same file
        try (FileReader reader = new FileReader(fileName)) {

            int character;

            System.out.println("\nFile contents:");

            while ((character = reader.read()) != -1) {

                System.out.print((char) character);
            }
        }
        catch (IOException e) {

            System.out.println(
                    "Error while reading file: "
                            + e.getMessage()
            );
        }
    }
}
