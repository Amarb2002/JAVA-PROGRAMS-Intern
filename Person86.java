class Person 
{

  private String name;
  private int age;
  private String address;

  public Person(String name, int age, String address) 
{
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void printDetails() 
{
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
  }
}

public class Person86 
{

  public static void main(String[] args) {
    Person person1 = new Person("Alice", 30, "123 Main St");
    Person person2 = new Person("Bob", 25, "456 Elm St");

    person1.printDetails();
    System.out.println();
    person2.printDetails();
  }
}
