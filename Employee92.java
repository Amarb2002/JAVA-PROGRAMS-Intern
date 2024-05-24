 class Employee 
{

  private String name;
  private int employeeId;

  public Employee(String name, int employeeId) 
{
    this.name = name;
    this.employeeId = employeeId;
  }

  public void printInfo() 
{
    System.out.println("Name: " + name);
    System.out.println("Employee ID: " + employeeId);
  }
}

class Manager extends Employee 
{
  private String department;

  public Manager(String name, int employeeId, String department) 
{
    super(name, employeeId);
    this.department = department;
  }
  public void printInfo() 
{
    super.printInfo(); 
    System.out.println("Department: " + department);
  }
}

public class Employee92 
{

  public static void main(String[] args) {
    Employee emp = new Employee("John Doe", 12345);
    Manager manager = new Manager("Jane Smith", 54321, "Engineering");

    System.out.println("Employee Details:");
    emp.printInfo();
    System.out.println("\nManager Details:");
    manager.printInfo();
  }
}
