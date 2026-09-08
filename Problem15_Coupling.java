/*
 * ============================
 * TIGHT COUPLING
 * ============================
 */

class PetrolEngine {

    void start() {

        System.out.println("Petrol engine started");
    }
}


class TightCar {

    private PetrolEngine engine;

    TightCar() {

        // TightCar directly creates PetrolEngine.
        engine = new PetrolEngine();
    }

    void startCar() {

        engine.start();
    }
}


/*
 * ============================
 * LOOSE COUPLING
 * ============================
 */

interface Engine {

    void start();
}


class DieselEngine implements Engine {

    @Override
    public void start() {

        System.out.println("Diesel engine started");
    }
}


class ElectricEngine implements Engine {

    @Override
    public void start() {

        System.out.println("Electric engine started");
    }
}


class LooseCar {

    private Engine engine;

    LooseCar(Engine engine) {

        this.engine = engine;
    }

    void startCar() {

        engine.start();
    }
}


public class Problem15_Coupling {

    public static void main(String[] args) {

        System.out.println("Tight Coupling:");

        TightCar tightCar = new TightCar();

        tightCar.startCar();


        System.out.println("\nLoose Coupling:");

        Engine diesel = new DieselEngine();

        LooseCar car1 = new LooseCar(diesel);

        car1.startCar();


        Engine electric = new ElectricEngine();

        LooseCar car2 = new LooseCar(electric);

        car2.startCar();
    }
}