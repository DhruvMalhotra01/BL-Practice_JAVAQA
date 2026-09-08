class Engine {

    void start() {

        System.out.println("Engine started");
    }
}


class Car {

    private Engine engine;

    Car() {

        // Engine is created as part of Car.
        engine = new Engine();
    }

    void startCar() {

        engine.start();

        System.out.println("Car started");
    }
}


public class Problem06_Composition {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}