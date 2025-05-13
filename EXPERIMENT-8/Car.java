class Car 
{
    class Engine {
        void start() {
            System.out.println("Engine started");
        }

        void stop() {
            System.out.println("Engine stopped");
        }
    }

    void drive() {
        Engine engine = new Engine();
        System.out.println("Preparing to drive...");
        engine.start();
        System.out.println("Car is now driving...");
        engine.stop();
        System.out.println("Drive complete.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
