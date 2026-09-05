// PracticeSet2.java

public class PracticeSet2 {

    public static void main(String[] args) {

        // 1. Create a Class and Object
        System.out.println("----- 1. Class and Object -----");

        Student student = new Student();
        student.name = "Dhruv";
        student.marks = 85;

        student.displayDetails();


        // 2. Constructors - Default and Parameterized
        System.out.println("\n----- 2. Constructors -----");

        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("Java Basics", 499);
        book2.display();


        // 3. Encapsulation
        System.out.println("\n----- 3. Encapsulation -----");

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());

        account.setBalance(7500);

        System.out.println("Updated Balance: " + account.getBalance());


        // 4. Access Modifiers
        System.out.println("\n----- 4. Access Modifiers -----");

        AccessDemo access = new AccessDemo();

        access.showAccessibleMembers();


        // 5. Single Inheritance
        System.out.println("\n----- 5. Single Inheritance -----");

        Dog dog = new Dog();

        dog.sound();


        // 6. Multilevel Inheritance
        System.out.println("\n----- 6. Multilevel Inheritance -----");

        SportsCar sportsCar = new SportsCar();

        sportsCar.start();
        sportsCar.drive();
        sportsCar.turbo();


        // 7. this Keyword
        System.out.println("\n----- 7. this Keyword -----");

        Employee employee = new Employee("Raj", 45000);

        employee.display();


        // 8. super Keyword
        System.out.println("\n----- 8. super Keyword -----");

        Child child = new Child();

        child.showMessage();


        // 9. Method Overloading
        System.out.println("\n----- 9. Method Overloading -----");

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.5, 3.5));
        System.out.println(calculator.add(1, 2, 3));


        // 10. Method Overriding
        System.out.println("\n----- 10. Method Overriding -----");

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        circle.area();
        rectangle.area();


        // 11. Abstract Class
        System.out.println("\n----- 11. Abstract Class -----");

        EmployeeSalary manager = new Manager();
        EmployeeSalary developer = new Developer();

        manager.calculateSalary();
        developer.calculateSalary();


        // 12. Interface
        System.out.println("\n----- 12. Interface -----");

        Payable creditCard = new CreditCardPayment();
        Payable cash = new CashPayment();

        creditCard.pay();
        cash.pay();


        // 13. static Keyword
        System.out.println("\n----- 13. static Keyword -----");

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        Counter.showCount();


        // 14. final Keyword
        System.out.println("\n----- 14. final Keyword -----");

        FinalDemo finalDemo = new FinalDemo();

        finalDemo.show();


        // 15. instanceof Operator
        System.out.println("\n----- 15. instanceof Operator -----");

        Animal animal = new Dog();

        if (animal instanceof Dog) {

            System.out.println("animal is an object of Dog");

            Dog dogObject = (Dog) animal;

            dogObject.sound();
        }
    }
}


/*
 * ============================================================
 * 1. CREATE A CLASS AND OBJECT
 * ============================================================
 */

class Student {

    String name;
    int marks;

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}


/*
 * ============================================================
 * 2. CONSTRUCTORS
 * ============================================================
 */

class Book {

    String title;
    int price;

    // Default constructor
    Book() {

        title = "Unknown";
        price = 0;
    }

    // Parameterized constructor
    Book(String title, int price) {

        this.title = title;
        this.price = price;
    }

    void display() {

        System.out.println("Title: " + title + ", Price: " + price);
    }
}


/*
 * ============================================================
 * 3. ENCAPSULATION
 * ============================================================
 */

class BankAccount {

    private double balance;

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
}


/*
 * ============================================================
 * 4. ACCESS MODIFIERS
 * ============================================================
 */

class AccessDemo {

    private int privateNumber = 10;

    protected int protectedNumber = 20;

    public int publicNumber = 30;

    int defaultNumber = 40;


    void showAccessibleMembers() {

        // All members are accessible inside the same class.

        System.out.println("Private: " + privateNumber);
        System.out.println("Protected: " + protectedNumber);
        System.out.println("Public: " + publicNumber);
        System.out.println("Default: " + defaultNumber);
    }
}


/*
 * ============================================================
 * 5. SINGLE INHERITANCE
 * ============================================================
 */

class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}


/*
 * ============================================================
 * 6. MULTILEVEL INHERITANCE
 * ============================================================
 */

class Vehicle {

    void start() {

        System.out.println("Vehicle starts");
    }
}


class Car extends Vehicle {

    void drive() {

        System.out.println("Car is driving");
    }
}


class SportsCar extends Car {

    void turbo() {

        System.out.println("Sports car uses turbo");
    }
}


/*
 * ============================================================
 * 7. this KEYWORD
 * ============================================================
 */

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}


/*
 * ============================================================
 * 8. super KEYWORD
 * ============================================================
 */

class Parent {

    Parent() {

        System.out.println("Parent constructor called");
    }

    void showMessage() {

        System.out.println("Message from Parent");
    }
}


class Child extends Parent {

    Child() {

        // Calling parent constructor
        super();
    }

    @Override
    void showMessage() {

        System.out.println("Message from Child");

        // Calling parent method
        super.showMessage();
    }
}


/*
 * ============================================================
 * 9. METHOD OVERLOADING
 * ============================================================
 */

class Calculator {

    // Two integers
    int add(int a, int b) {

        return a + b;
    }

    // Two doubles
    double add(double a, double b) {

        return a + b;
    }

    // Three integers
    int add(int a, int b, int c) {

        return a + b + c;
    }
}


/*
 * ============================================================
 * 10. METHOD OVERRIDING
 * ============================================================
 */

class Shape {

    void area() {

        System.out.println("Area of shape");
    }
}


class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    @Override
    void area() {

        double result = Math.PI * radius * radius;

        System.out.println("Circle area: " + result);
    }
}


class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    @Override
    void area() {

        double result = length * width;

        System.out.println("Rectangle area: " + result);
    }
}


/*
 * ============================================================
 * 11. ABSTRACTION USING ABSTRACT CLASS
 * ============================================================
 */

abstract class EmployeeSalary {

    abstract void calculateSalary();
}


class Manager extends EmployeeSalary {

    @Override
    void calculateSalary() {

        System.out.println("Manager salary: 80000");
    }
}


class Developer extends EmployeeSalary {

    @Override
    void calculateSalary() {

        System.out.println("Developer salary: 60000");
    }
}


/*
 * ============================================================
 * 12. ABSTRACTION USING INTERFACE
 * ============================================================
 */

interface Payable {

    void pay();
}


class CreditCardPayment implements Payable {

    @Override
    public void pay() {

        System.out.println("Payment made using Credit Card");
    }
}


class CashPayment implements Payable {

    @Override
    public void pay() {

        System.out.println("Payment made using Cash");
    }
}


/*
 * ============================================================
 * 13. static KEYWORD
 * ============================================================
 */

class Counter {

    static int count = 0;

    Counter() {

        count++;
    }

    static void showCount() {

        System.out.println("Number of objects created: " + count);
    }
}


/*
 * ============================================================
 * 14. final KEYWORD
 * ============================================================
 */

// Final class cannot be inherited
final class FinalClass {

    void display() {

        System.out.println("This is a final class");
    }
}


class FinalDemo {

    // Final variable cannot be changed
    final int number = 100;


    // Final method cannot be overridden
    final void show() {

        System.out.println("Final variable value: " + number);
        System.out.println("This is a final method");
    }
}


/*
 * ============================================================
 * 15. instanceof OPERATOR
 * ============================================================
 */

// Animal and Dog classes are already created above.
// We use them here:
//
// Animal animal = new Dog();
//
// animal instanceof Dog
//
// This checks whether the object referred to by animal
// is actually a Dog object.