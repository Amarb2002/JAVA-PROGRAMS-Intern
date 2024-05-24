class Shape 
{

  public double getArea() 
{
    return 0.0;
  }
}

class Circle extends Shape 
{

  private double radius;

  public Circle(double radius) 
{
    this.radius = radius;
  }

  public double getArea() 
{
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape 
{
  private double width;
  private double height;

  public Rectangle(double width, double height) 
{
    this.width = width;
    this.height = height;
  }
  public double getArea() 
{
    return width * height;
  }
}

public class Shape1
{
  public static void main(String[] args) 
{
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);

    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Rectangle Area: " + rectangle.getArea());
  }
}
