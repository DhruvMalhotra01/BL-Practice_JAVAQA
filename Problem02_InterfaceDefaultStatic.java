interface Vehicle {

    default void start() {

        System.out.println("Vehicle is starting");
    }

    static void info() {

        System.out.println("Vehicles are used for transportation");
    }
}


class Car implements Vehicle {

    // No need to override start()
    // because Vehicle already provides a default implementation.
}


public class Problem02_InterfaceDefaultStatic {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        // Static interface methods are called using the interface name.
        Vehicle.info();
    }
}