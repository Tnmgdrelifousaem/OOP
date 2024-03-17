abstract class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int year;

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate(int speed);
    public abstract void brake();
    public abstract void displayInfo();
}

// Интерфейс Flyable
interface Flyable {
    void takeOff();
    void land();
}

// Интерфейс Swimmable
interface Swimmable {
    void startSwimming();
    void stopSwimming();
}

// Класс Car
class Car extends Vehicle {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = 0; // начальный уровень топлива 0
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerated to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("Car stopped.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }

    public void refuel(int liters) {
        currentFuelLevel += liters;
        System.out.println(liters + " liters refueled. Current fuel level: " + currentFuelLevel);
    }
}

// Класс Aircraft
class Aircraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;

    public Aircraft(int id, String brand, String model, int year, int maxAltitude) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = false; // начальное состояние - не в полете
    }

    @Override
    public void startEngine() {
        System.out.println("Aircraft engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Aircraft engine stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Aircraft accelerated to " + speed + " km/h.");
    }

    @Override
    public void brake() {
        System.out.println("Aircraft stopped.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Aircraft: " + brand + " " + model + " (" + year + ")");
    }

    @Override
    public void takeOff() {
        isFlying = true;
        System.out.println("Aircraft took off.");
    }

    @Override
    public void land() {
        isFlying = false;
        System.out.println("Aircraft landed.");
    }
}

// Класс Boat
class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = false; // начальное состояние - не движется по воде
    }

    @Override
    public void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Boat speed increased to " + speed + " knots.");
    }

    @Override
    public void brake() {
        System.out.println("Boat stopped.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Boat: " + brand + " " + model + " (" + year + ")");
    }

    @Override
    public void startSwimming() {
        isSailing = true;
        System.out.println("Boat started sailing.");
    }

    @Override
    public void stopSwimming() {
        isSailing = false;
        System.out.println("Boat stopped sailing.");
    }
}
