public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }

    @Override 
    public void moveForward(){
        System.out.println("A car moves forward.");
    }

    @Override
    public  void moveBackwards() {
        System.out.println("A car moves backwards.");
    }

    @Override 
    public void moveLeft() {
        System.out.println("A car moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right.");
    }
}