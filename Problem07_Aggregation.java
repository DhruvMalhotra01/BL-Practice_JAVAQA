import java.util.ArrayList;
import java.util.List;


class Professor {

    String name;

    Professor(String name) {

        this.name = name;
    }

    void teach() {

        System.out.println(name + " is teaching");
    }
}


class Department {

    private List<Professor> professors;

    Department(List<Professor> professors) {

        this.professors = professors;
    }

    void showProfessors() {

        for (Professor professor : professors) {

            professor.teach();
        }
    }
}


public class Problem07_Aggregation {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Raj");
        Professor professor2 = new Professor("Amit");

        List<Professor> professors = new ArrayList<>();

        professors.add(professor1);
        professors.add(professor2);

        Department department = new Department(professors);

        department.showProfessors();
    }
}