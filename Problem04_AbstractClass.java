abstract class Employee {

    // Concrete method
    void displayCompany() {

        System.out.println("Company: ABC Technologies");
    }

    // Abstract method
    abstract void calculateBonus();
}


class Manager extends Employee {

    @Override
    void calculateBonus() {

        System.out.println("Manager bonus: 20000");
    }
}


class Clerk extends Employee {

    @Override
    void calculateBonus() {

        System.out.println("Clerk bonus: 8000");
    }
}


public class Problem04_AbstractClass {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.displayCompany();
        manager.calculateBonus();

        System.out.println();

        Clerk clerk = new Clerk();
        clerk.displayCompany();
        clerk.calculateBonus();
    }
}