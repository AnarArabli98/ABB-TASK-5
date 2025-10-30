package lesson6.classwork;

public class Car {

    private String model;
    private String color;
    private int numberOfWheels;
    private static int numberOfCarsStaticField;
    public Car(String model, String color, int numberOfWheels) {
        this.model = model;
        this.color = color;
        this.numberOfWheels = numberOfWheels;


    }

    public void drive() {
        System.out.println("Driving");
    }


    class Engine{
        private int horsePower;

        public Engine(int horsePower) {

            this.horsePower = horsePower;
        }
        public void startEngine() {
            System.out.println("Starting Engine");
            drive();
        }


    }
    static class EngineNestedClass{
        private int horsePowerNested;
        public EngineNestedClass(int horsePower) {
            this.horsePowerNested = horsePower;
        }
        public void startEngine() {
            System.out.println("Starting Engine");
            startEngine();
            System.out.println(numberOfCarsStaticField);
        }
    }
}

