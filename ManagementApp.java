import java.util.*;

// Develop a console-based Java application to manage school student results and generate grocery store bills.  
// The application should allow users to enter student details and marks, calculate total, percentage, and grade, and display the result.
// It should also allow grocery items, quantities, and prices to be entered and generate the final bill.
// Use single and multidimensional arrays, arraycopy(), String manipulation, methods, and parameter passing to organize the program into proper modules.
// Understand how the JVM, compiler/interpreter, and garbage collector work while executing the application.

public class ManagementApp {
    
    public static int Calculation(int[] quantity ,int[] price){
        int sum = 0;
        for(int i = 0; i < quantity.length; i++){
            sum += quantity[i] * price[i];
        }
        return sum;
    }
    
    public static void calculatePercentage(int total, int count){
        double percentage = (double) total / (count * 100) * 100;
        String grade;
        if(percentage >= 90){
            grade = "A";
        }else if(percentage >= 80){
            grade = "B";
        }else if(percentage >= 70){
            grade = "C";
        }else if(percentage >= 60){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Management Application");
        System.out.println("=====================================");
        System.out.println("Select the application you want to use:");
        System.out.println("1. Student Result Management");
        System.out.println("2. Grocery Store Billing");
        int choice = sc.nextInt();
        int softwareVersion = 0;
        
        if (choice == 2) {
            System.out.println("You have selected Student Result Management");
            softwareVersion = 2;           
        } else if (choice == 1) {
            System.out.println("You have selected Grocery Store Billing");
            softwareVersion = 1;
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
        
        System.out.println("Enter the total count");
        int count = sc.nextInt();
        int[] quantity = new int[count];
        String[] name = new String[count];
        int[] price = new int[count];
        int quantitySum = 0;
        
        for (int i = 0; i < count; i++){
            System.out.println("Enter the item name " + (i + 1) + ": ");
            name[i] = sc.next();
            
            if(softwareVersion == 1){
                quantity[i] = 1;
            } else {
                System.out.println("Enter quantity/marks: ");
                quantity[i] = sc.nextInt();
            }
            
            System.out.println("Enter the price/marks for " + name[i] + ": ");
            price[i] = sc.nextInt();
            quantitySum += quantity[i];
        }
        
        System.out.println("======================================");
        
        // Moved total calculation outside the switch to resolve scope/initialization errors
        int total = Calculation(quantity , price);
        
        switch (softwareVersion){
            case 1:
                System.out.println("Grocery Store Billing");
                for(int i = 0; i < count; i++){
                    System.out.println("Item: " + name[i] + ", Quantity: " + quantity[i] + ", Price: " + price[i]);
                }
                
                String[] bill = new String[3];
                // items, quantities, and prices to be entered and generate the final bill.
                bill[0] = "Items count: " + count;
                bill[1] = "Quantity sum: " + quantitySum;
                bill[2] = "Total price: " + total;
                
                String[] finalBill = new String[bill.length];
                System.arraycopy(bill, 0, finalBill, 0, bill.length);
                
                for(String s : finalBill) {
                    System.out.println(s);
                }
                
                System.out.println("======================================");
                break; 
                
            case 2:
                System.out.println("Student Result Management");
                // percentage, and grade
                for(int i = 0; i < count; i++){
                    System.out.println("Student: " + name[i] + ", Marks: " + price[i]);
                }
                calculatePercentage(total, count);
                
                String[] newStr = new String[2];
                newStr[0] = "Total Marks: " + total;
                newStr[1] = "Percentage: " + ((double) total / (count * 100) * 100) + "%";
                
                // Using System.arraycopy as requested
                String[] finalStr = new String[newStr.length];
                System.arraycopy(newStr, 0, finalStr, 0, newStr.length);
                
                for(String s : finalStr) {
                    System.out.println(s);
                }
                
                System.out.println("======================================");
                break; // Added break
        }
        sc.close();
    }
}

// add print for the gorcery store billing
// add seprate total menu 
