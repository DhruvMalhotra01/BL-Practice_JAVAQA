package CSV;

import java.util.ArrayList;
import java.util.List;

public class Problem11_CSVWithCommas {

    static List<String> parseCSVLine(String line) {

        List<String> fields = new ArrayList<>();

        StringBuilder current = new StringBuilder();

        boolean insideQuotes = false;


        for (int i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);


            if (ch == '"') {

                insideQuotes = !insideQuotes;
            }

            else if (ch == ',' && !insideQuotes) {

                fields.add(current.toString().trim());

                current.setLength(0);
            }

            else {

                current.append(ch);
            }
        }


        fields.add(current.toString().trim());


        return fields;
    }


    public static void main(String[] args) {

        String line =
                "101,Riya,\"12 MG Road, Delhi\",88";


        List<String> data =
                parseCSVLine(line);


        for (String field : data) {

            System.out.println(field);
        }
    }
}
