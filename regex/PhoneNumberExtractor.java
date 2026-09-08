package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {

    public static void main(String[] args) {

        String fileName = "contacts.txt";

        String phoneRegex = "\\b[6-9][0-9]{9}\\b";

        Pattern pattern = Pattern.compile(phoneRegex);


        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            boolean found = false;


            while ((line = reader.readLine()) != null) {

                Matcher matcher = pattern.matcher(line);


                while (matcher.find()) {

                    System.out.println(
                            "Phone number found: "
                                    + matcher.group()
                    );

                    found = true;
                }
            }


            if (!found) {

                System.out.println(
                        "No valid phone numbers found."
                );
            }

        }
        catch (IOException e) {

            System.out.println(
                    "Unable to read the file: "
                            + e.getMessage()
            );
        }
    }
}