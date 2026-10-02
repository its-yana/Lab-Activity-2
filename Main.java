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

     System.out.println("\nGetters");
     System.out.println("Brand: " + v1.getBrand());
     System.out.println("Model: " + v1.getModel());
     System.out.println("Year: " + v1.getYear());

     System.out.println("\nsetYear Tests");

     System.out.println("setYear(2000): " + v1.setYear(2000));
     System.out.println("Stored year: " + v1.getYear());
     System.out.println("Age: " + v1.calculateAge());
     System.out.println("Vintage: " + v1.isVintage());

     System.out.println("\nsetYear(1885): " + v1.setYear(1885));
     System.out.println("Stored year: " + v1.getYear());

     System.out.println("\nsetYear(2027): " + v1.setYear(2027));
     System.out.println("Stored year: " + v1.getYear());

     System.out.println("\nConstructor Validation Tests");

     Vehicle invalid1 = new Vehicle("Test", "Invalid", 1885);
      System.out.println("Vehicle with year 1885: " + invalid1.getYear());

     Vehicle invalid2 = new Vehicle("Test", "Invalid", 2027);
      System.out.println("Vehicle with year 2027: " + invalid2.getYear());
  }
}