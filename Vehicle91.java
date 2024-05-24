 class Vehicle 
{
  private String make;
  private String model;

  public Vehicle(String make, String model) 
{
    this.make = make;
    this.model = model;
  }

  public void displayInfo() 
{
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
  }
}

class Car extends Vehicle 
{
  private int numDoors;
  public Car(String make, String model, int numDoors) 
{
    super(make, model); 
    this.numDoors = numDoors;
  }
  public void displayInfo() 
{
    super.displayInfo();
    System.out.println("Number of Doors: " + numDoors);
  }
}

class Motorcycle extends Vehicle 
{
  private int engineSize;
  public Motorcycle(String make, String model, int engineSize) 
{
    super(make, model);
    this.engineSize = engineSize;
  }

  public void displayInfo() 
{
    super.displayInfo();
    System.out.println("Engine Size: " + engineSize + " cc");
  }
}

public class Vehicle91 
{
  public static void main(String[] args) {
    Car car = new Car("Honda", "Civic", 4);
    Motorcycle motorcycle = new Motorcycle("Yamaha", "R6", 600);

    car.displayInfo();
    System.out.println();
    motorcycle.displayInfo();
  }
}
