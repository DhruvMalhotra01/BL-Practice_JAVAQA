class Computer {

    String brand = "Dell";


    class Processor {

        void showProcessor() {

            System.out.println("Processor belongs to " + brand + " computer");
        }
    }
}


public class Problem11_InnerClass {

    public static void main(String[] args) {

        Computer computer = new Computer();

        Computer.Processor processor = computer.new Processor();

        processor.showProcessor();
    }
}