package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem03_ByteStreamCopy {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destinationFile = "copy.txt";


        try (
                FileInputStream input =
                        new FileInputStream(sourceFile);

                FileOutputStream output =
                        new FileOutputStream(destinationFile)
        ) {

            int data;

            while ((data = input.read()) != -1) {

                output.write(data);
            }

            System.out.println(
                    "File copied successfully."
            );
        }
        catch (IOException e) {

            System.out.println(
                    "Error while copying file: "
                            + e.getMessage()
            );
        }
    }
}
