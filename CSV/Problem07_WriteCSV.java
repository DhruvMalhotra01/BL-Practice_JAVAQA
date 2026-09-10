package CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Problem07_WriteCSV {

    public static void main(String[] args) {

        String fileName = "students.csv";


        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(fileName))) {

            writer.write("Name,Age,Marks");
            writer.newLine();

            writer.write("Riya,20,88");
            writer.newLine();

            writer.write("Aman,21,76");
            writer.newLine();

            writer.write("Neha,19,91");


            System.out.println(
                    "CSV file created successfully."
            );
        }
        catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}
