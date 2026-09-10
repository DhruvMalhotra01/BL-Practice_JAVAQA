package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int rollNo;


    Student(String name, int rollNo) {

        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName() {

        return name;
    }


    public int getRollNo() {

        return rollNo;
    }
}


public class Problem05_ObjectSerialization {

    public static void main(String[] args) {

        String fileName = "student.ser";


        Student student =
                new Student("Riya", 12);


        // Serialization
        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream(fileName))) {

            output.writeObject(student);

            System.out.println(
                    "Student serialized successfully."
            );
        }
        catch (IOException e) {

            System.out.println(
                    "Serialization error: "
                            + e.getMessage()
            );
        }


        // Deserialization
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(fileName))) {

            Student result =
                    (Student) input.readObject();


            System.out.println(
                    "Deserialized Student: "
                            + result.getName()
            );

            System.out.println(
                    "Roll No: "
                            + result.getRollNo()
            );
        }
        catch (IOException | ClassNotFoundException e) {

            System.out.println(
                    "Deserialization error: "
                            + e.getMessage()
            );
        }
    }
}
