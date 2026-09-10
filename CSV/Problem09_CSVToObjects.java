package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Problem09_CSVToObjects {

    public static void main(String[] args) {

        String fileName = "employees.csv";

        List<Employee> employees =
                new ArrayList<>();


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;

            // Skip header
            reader.readLine();


            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");


                if (data.length != 3) {

                    System.out.println(
                            "Skipping invalid row: "
                                    + line
                    );

                    continue;
                }


                int id = Integer.parseInt(data[0]);

                String name = data[1];

                double salary =
                        Double.parseDouble(data[2]);


                Employee employee =
                        new Employee(
                                id,
                                name,
                                salary
                        );


                employees.add(employee);
            }
        }
        catch (IOException e) {

            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
        catch (NumberFormatException e) {

            System.out.println(
                    "Invalid numeric value in CSV."
            );
        }


        System.out.println("\nEmployees:");

        for (Employee employee : employees) {

            employee.display();
        }
    }
}
