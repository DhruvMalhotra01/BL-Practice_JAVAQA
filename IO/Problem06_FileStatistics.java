package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem06_FileStatistics {

    public static void main(String[] args) {

        String fileName = "notes.txt";

        int lines = 0;
        int words = 0;
        int characters = 0;


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;


            while ((line = reader.readLine()) != null) {

                lines++;

                // Count characters in the line
                characters += line.length();


                // Count words
                if (!line.trim().isEmpty()) {

                    words += line.trim()
                                 .split("\\s+")
                                 .length;
                }
            }


            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println(
                    "Characters: " + characters
            );

        }
        catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
