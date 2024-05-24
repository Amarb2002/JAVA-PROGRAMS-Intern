abstract class Shape 
{
  public abstract double getArea();
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

class Triangle extends Shape 
{
  private double base;
  private double height;

  public Triangle(double base, double height) 
{
    this.base = base;
    this.height = height;
  }

  public double getArea() 
{
    return 0.5 * base * height;
  }
}

public class Shape94
{
  public static void main(String[] args) 
{

    Shape circle = new Circle(5);
    Shape rectangle = new Rectangle(4, 6);
    Shape triangle = new Triangle(3, 4);

    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Triangle Area: " + triangle.getArea());
  }
}
