package JSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Problem14_JSONArrayToObjects {

    public static void main(String[] args) {

        ObjectMapper mapper =
                new ObjectMapper();


        try {

            List<Employee> employees =
                    mapper.readValue(
                            new File("JSON/employees.json"),
                            new TypeReference<List<Employee>>() {}
                    );


            for (Employee employee : employees) {

                employee.display();
            }

        }
        catch (IOException e) {

            System.out.println(
                    "Error reading employees: "
                            + e.getMessage()
            );
        }
    }
}
