final class Student {

    private final String name;
    private final int rollNumber;


    Student(String name, int rollNumber) {

        this.name = name;
        this.rollNumber = rollNumber;
    }


    public String getName() {

        return name;
    }


    public int getRollNumber() {

        return rollNumber;
    }
}


public class Problem14_ImmutableClass {

    public static void main(String[] args) {

        Student student = new Student("Dhruv", 101);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());

        // No setter methods are provided.
        // Therefore, the object's state cannot be changed.
    }
}