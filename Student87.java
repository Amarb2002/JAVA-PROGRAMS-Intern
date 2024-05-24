class Student 
{
  private String name;
  private int rollNumber;
  private double marks; 

  public Student(String name, int rollNumber) 
{
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = 0.0; 
  }

  public void setMark(double mark) 
{
    this.marks = mark;
  }

  public void printDetails() 
{
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Mark: " + marks);
  }
}

public class Student87
{
  public static void main(String[] args) {
    // Create student objects with different information
    Student student1 = new Student("Alice", 1);
    student1.setMark(85.5);

    Student student2 = new Student("Bob", 2);
    student2.setMark(92.0); 

    student1.printDetails();
    System.out.println();
    student2.printDetails();
  }
}
