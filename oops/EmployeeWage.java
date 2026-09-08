package oops;

import java.util.ArrayList;
import java.util.List;


abstract class Employee {

    private String name;
    private double wageRate;
    private int workingHours;


    Employee(
            String name,
            double wageRate,
            int workingHours) {

        this.name = name;
        this.wageRate = wageRate;
        this.workingHours = workingHours;
    }


    public String getName() {

        return name;
    }


    public double getWageRate() {

        return wageRate;
    }


    public int getWorkingHours() {

        return workingHours;
    }


    abstract double calculateDailyWage();


    double calculateMonthlyWage() {

        return calculateDailyWage() * 26;
    }


    void displaySalary() {

        System.out.println(
                "\nEmployee: " + name
        );

        System.out.println(
                "Working hours: " + workingHours
        );

        System.out.println(
                "Wage rate: " + wageRate
        );

        System.out.println(
                "Daily wage: " + calculateDailyWage()
        );

        System.out.println(
                "Monthly wage: " + calculateMonthlyWage()
        );
    }
}


class FullTimeEmployee extends Employee {

    FullTimeEmployee(
            String name,
            double wageRate,
            int workingHours) {

        super(name, wageRate, workingHours);
    }


    @Override
    double calculateDailyWage() {

        return getWageRate()
                * getWorkingHours();
    }
}


class PartTimeEmployee extends Employee {

    PartTimeEmployee(
            String name,
            double wageRate,
            int workingHours) {

        super(name, wageRate, workingHours);
    }


    @Override
    double calculateDailyWage() {

        // Part-time employee has a maximum
        // of 4 paid hours per day.

        int paidHours =
                Math.min(getWorkingHours(), 4);

        return getWageRate() * paidHours;
    }
}


public class EmployeeWage {

    public static void main(String[] args) {

        List<Employee> employees =
                new ArrayList<>();


        employees.add(
                new FullTimeEmployee(
                        "Raj",
                        800,
                        8
                )
        );


        employees.add(
                new PartTimeEmployee(
                        "Amit",
                        500,
                        4
                )
        );


        double totalPayroll = 0;


        for (Employee employee : employees) {

            employee.displaySalary();

            totalPayroll +=
                    employee.calculateMonthlyWage();
        }


        System.out.println(
                "\n-------------------------"
        );

        System.out.println(
                "Overall Monthly Payroll: "
                        + totalPayroll
        );
    }
}