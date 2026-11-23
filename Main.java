
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        // Create objects
        Car car = new Car("Mitsubishi", "Mirage G4", 2019, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2020, "V-Twin");
        Truck truck = new Truck("Freightliner", "Freightliner Cascadia", 2026, 10);
        Printer printer = new Printer();

        // DEMO 1: Serviceable Array
        System.out.println("=== Serviceable Items ===");

        Serviceable[] serviceItems = {car, motorcycle, truck, printer};

        for (Serviceable item : serviceItems) {
            performService(item);
        }

        // DEMO 2: Vehicle Array
        System.out.println("\n=== Vehicle Information ===");

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.move();
            System.out.println();
        }

        // DEMO 3: Parent References
        System.out.println("=== Parent References ===");

        Vehicle vehicle = new Car("Mitsubishi", "Mirage G4", 2019, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        // DEMO 4: Truck
        System.out.println("=== Truck ===");

        Truck truckDemo = new Truck("Freightliner", "Freightliner Cascadia", 2026, 10);
        printDetails(truckDemo);
        truckDemo.moveForward();
        truckDemo.moveBackwards();
        truckDemo.moveLeft();
        truckDemo.moveRight();
        System.out.println();

        // DEMO 5: Motorcycle
        System.out.println("=== Motorcycle ===");

        Motorcycle motorcycleDemo = new Motorcycle("Harley-Davidson", "Street 750", 2020, "V-Twin");
        printDetails(motorcycleDemo);
        motorcycleDemo.moveForward();
        motorcycleDemo.moveBackwards();
        motorcycleDemo.moveLeft();
        motorcycleDemo.moveRight();
        System.out.println();

        // DEMO 6: Car
        System.out.println("=== Car ===");

        Car carDemo = new Car("Geely", "EX5", 2000, 4);
        printDetails(carDemo);
        carDemo.moveForward();
        carDemo.moveBackwards();
        carDemo.moveLeft();
        carDemo.moveRight();
        System.out.println();

        // DEMO 7: Array of Vehicles
        System.out.println("=== Array of Vehicles ===");

        Vehicle[] vehicleArray = {
            new Car("Mitsubishi", "Mirage G4", 2019, 4),
            new Truck("Freightliner", "Freightliner Cascadia", 2026, 10),
            new Motorcycle("Harley-Davidson", "Street 750", 2020, "V-Twin")
        };

        for (Vehicle currentVehicle : vehicleArray) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackwards();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
    }
}
