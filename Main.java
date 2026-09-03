import java.util.*;
// Student Result Analyzer
// - Write a Java program to analyze the result of one student.
// - Store the student name, roll number, and marks in 5 subjects using arrays.
// - Requirements

// Calculate:
//     Total marks
//     Percentage
//     Grade (A, B, C, D, F)
//     The student fails if they score below 35 in any subject.

// - Display the student's:
//     Name
//     Roll number
//     Marks
//     Total
//     Percentage
//     Grade
//     Pass/Fail status

// - Use separate methods for major operations:
//     calculateTotal()
//     calculatePercentage()
//     calculateGrade()
//     checkResult()
//     displayResult()


// *Note: dont use java collection...

public class Main {
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    
    public static int calculatePercentage(int total) {
        return total / 5;
    }

    public static char calculateGrade(int total){
        int marks = total/5;
        if(marks> 90){
            return 'A';
        }else if(marks > 80){
            return 'B';
        }else if(marks > 70){
            return 'C';
        }else return 'F';
    }

    public static void display(String name, int total, int percentage, char grade){
        System.out.println("hi " + name + "\ntotal marks : " + total + "\npercentage: " + percentage + "%\ngrade : " + grade );

    }
    public static void main(String[] args) {
        System.out.println("-------------------Welcome to the result -----------------------");
        System.out.print("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello " + name +"\nEnter the details as follow :- \nEnter the rollno. ");
        int num = sc.nextInt();
        System.out.println("===============Enter the Marks to Generate the Report Card===========================");
        int[] marks = new int[6];
        System.out.print("Enter the marks in the range of (1-100)\n");
        for(int i = 0;i<5;i++){
            System.out.print("Enter the marks for " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        int total = calculateTotal(marks);
        int percentage = calculatePercentage(total);
        char grade = calculateGrade(total);
        display(name,total,percentage,grade);


    }
}
