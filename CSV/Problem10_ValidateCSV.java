package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem10_ValidateCSV {

    public static void main(String[] args) {

        String fileName = "student_marks.csv";


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(fileName))) {

            String line;

            int lineNumber = 1;


            // Skip header
            reader.readLine();


            while ((line = reader.readLine()) != null) {

                lineNumber++;


                String[] data = line.split(",");


                if (data.length < 3) {

                    System.out.println(
                            "Line " + lineNumber
                            + ": Missing field"
                    );

                    continue;
                }


                String name = data[0].trim();

                String marksText = data[2].trim();


                if (marksText.isEmpty()) {

                    System.out.println(
                            "Line " + lineNumber
                            + ": Marks are missing"
                    );

                    continue;
                }


                try {

                    double marks =
                            Double.parseDouble(marksText);


                    if (marks < 0 || marks > 100) {

                        System.out.println(
                                "Line " + lineNumber
                                + ": Marks must be between 0 and 100"
                        );

                        continue;
                    }


                    System.out.println(
                            "Valid: " + name
                                    + " - " + marks
                    );

                }
                catch (NumberFormatException e) {

                    System.out.println(
                            "Line " + lineNumber
                            + ": Marks must be numeric"
                    );
                }
            }
        }
        catch (IOException e) {

            System.out.println(
                    "File error: " + e.getMessage()
            );
        }
    }
}
