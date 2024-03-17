public static void main(String[] args) {
        Car car = new Car(1, "Toyota", "Camry", 2021, 60);
        Aircraft aircraft = new Aircraft(2, "Boeing", "747", 2000, 35000);
        Boat boat = new Boat(3, "Yamaha", "242X", 2019, 45);

        car.startEngine();
        car.accelerate(60);
        car.brake();
        car.refuel(20);
        car.displayInfo();

        aircraft.startEngine();
        aircraft.takeOff();
        aircraft.accelerate(800);
        aircraft.land();
        aircraft.stopEngine();
        aircraft.displayInfo();

        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(20);
        boat.stopSwimming();
        boat.stopEngine();
        boat.displayInfo();
  }
