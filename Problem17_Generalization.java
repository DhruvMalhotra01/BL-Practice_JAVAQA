class Vehicle {

    String brand;

    Vehicle(String brand) {

        this.brand = brand;
    }

    void start() {

        System.out.println(brand + " vehicle is starting");
    }
}


class Car extends Vehicle {

    Car(String brand) {

        super(brand);
    }

    void drive() {

        System.out.println("Car is driving");
    }
}


class Bike extends Vehicle {

    Bike(String brand) {

        super(brand);
    }

    void ride() {

        System.out.println("Bike is being ridden");
    }
}


public class Problem17_Generalization {

    public static void main(String[] args) {

        Car car = new Car("Toyota");

        Bike bike = new Bike("Honda");


        car.start();
        car.drive();


        System.out.println();


        bike.start();
        bike.ride();
    }
}