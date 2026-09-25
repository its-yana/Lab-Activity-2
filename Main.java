public class Main {
  public static void main(String[] args){
  
  Vehicle v1 = new Vehicle("Toyota", "Mustang", 2019);
  Vehicle v2 = new Vehicle("Volkswagen", "Jetta", 1998);
  Vehicle v3 = new Vehicle("Toyota", "Highlander", 2005);
  
  v1.displayInfo();
  v2.displayInfo();
  v3.displayInfo();
  
  System.out.println("\nVehicile 1");
  System.out.println("Age: " + v1.calculateAge());
  System.out.println("Vintage: " + v1.isVintage());
  
  System.out.println("\nVehicile 2");
  System.out.println("Age: " + v2.calculateAge());
  System.out.println("Vintage: " + v2.isVintage());
  
  System.out.println("\nVehicile 3");
  System.out.println("Age: " + v3.calculateAge());
  System.out.println("Vintage: " + v3.isVintage());
  }
}