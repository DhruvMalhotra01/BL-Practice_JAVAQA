package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {

    static void readFile(String fileName) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        }
        catch (IOException e) {

            throw new FileNotFoundCustomException(
                    "Unable to read file: " + fileName
            );
        }
    }


    public static void main(String[] args) {

        String fileName = "data.txt";

        try {

            readFile(fileName);

        }
        catch (FileNotFoundCustomException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
