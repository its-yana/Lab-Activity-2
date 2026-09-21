public class Main {
  public static void main(String[] args){
  
  Vehicle v1 = new Vehicle();
  v1.brand = "Toyota";
  v1.model = "Mustang";
  v1.year = 2019;
  v1.displayInfo();
  
  Vehicle v2 = new Vehicle();
  v2.brand = "Volkswagen";
  v2.model = "Jetta";
  v2.year = 1998;
  v2.displayInfo();
  
  Vehicle v3 = new Vehicle();
  v3.brand = "Toyota";
  v3.model = "Highlander";
  v3.year = 2005;
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