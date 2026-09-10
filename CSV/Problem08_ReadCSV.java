package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem08_ReadCSV {

    public static void main(String[] args) {

        String fileName = "students.csv";


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;


            System.out.printf(
                    "%-15s %-10s %-10s%n",
                    "Name",
                    "Age",
                    "Marks"
            );

            System.out.println(
                    "--------------------------------"
            );


            // Skip header
            reader.readLine();


            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");


                if (data.length == 3) {

                    System.out.printf(
                            "%-15s %-10s %-10s%n",
                            data[0],
                            data[1],
                            data[2]
                    );
                }
            }
        }
        catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
