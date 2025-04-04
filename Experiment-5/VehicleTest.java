class Vehicle {
    protected String brand;
    protected String model;
    protected double price;
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;}
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);}
}
class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;}
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);}
}
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;
    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;}
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");}
}
class Motorcycle extends Vehicle {
    private int engineCapacity; 
    private String type; 
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;}
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Type: " + type);}
}
public class VehicleTest {
    public static void main(String[] args) {
        System.out.println("Car Details:");
        Car car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        car.displayDetails();
        System.out.println();
        System.out.println("Electric Car Details:");
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 45000, 5, "Electric", 75, 8);
        eCar.displayDetails();
        System.out.println();
        System.out.println("Motorcycle Details:");
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Sportster", 15000, 1200, "Cruiser");
        bike.displayDetails();}
}
