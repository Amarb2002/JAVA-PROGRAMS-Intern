class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int width, int height) 
{
        this.width = width;
        this.height = height;
    }

    public int getArea() 
{
        return width * height;
    }

    public int getPerimeter() 
{
        return 2 * (width + height);
    }

    public void printInfo() 
{
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) 
{
       
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(7, 3);

        System.out.println("Rectangle 1:");
        rect1.printInfo();
        System.out.println("Rectangle 2:");
        rect2.printInfo();
    }
}
