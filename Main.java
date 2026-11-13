public class Main {

   public static void printDetails(Vehicle vehicle) {
      vehicle.displayInfo();
   }
      public static void main(String[] args){

      // DEMO 1 : Parent References 
      System.out.println("=== Parent References ===");
      Vehicle vehicle = new Car("Mitsubishi", "Mirage G4", 2019, 4);
      vehicle.displayInfo();
      vehicle.moveForward();
      vehicle.moveBackwards();
      vehicle.moveLeft();
      vehicle.moveRight();
      System.out.println();

      // 1.1 The same variable now refers to a Truck object
      System.out.println("=== Truck ===");
      Truck truck = new Truck("Freightliner", "Freightliner Cascadia", 2026, 10);
      printDetails(truck);
      truck.moveForward();
      truck.moveBackwards();
      truck.moveLeft();
      truck.moveRight();
      System.out.println();

      // 1.2 The same variable now refers to a Motorcycle object
      System.out.println("=== Motorcycle ===");
      Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, "V-Twin");
      printDetails(motorcycle);
      motorcycle.moveForward();
      motorcycle.moveBackwards();
      motorcycle.moveLeft();
      motorcycle.moveRight();
      System.out.println(); 

      // DEMO 2 : One method accept different Vehicle subclasses
      System.out.println("=== Method Parameters ===");
      Car car = new Car("Geely", "EX5", 2000, 4);
      printDetails(car);
      car.moveForward();
      car.moveBackwards();
      car.moveLeft();
      car.moveRight();
      System.out.println(); 

      // DEMO 3 : One array holds different Vehicle subclasses
      System.out.println("=== Array of Vehicles ===");

      Vehicle[] vehicles = {
          new Car("Mitsubishi", "Mirage G4", 2019, 4),
          new Truck("Freightliner", "Freightliner Cascadia", 2026, 10),
          new Motorcycle("Harley-Davidson", "Street 750", 2020, "V-Twin")
      };
      for (Vehicle currentVehicle : vehicles) {
          printDetails(currentVehicle);
          currentVehicle.moveForward();
          currentVehicle.moveBackwards();
          currentVehicle.moveLeft();
          currentVehicle.moveRight();
          System.out.println(); 
      }
   }
}