public class TriangleType25 {

  public static void main(String[] args) {
    int side1 = 3;
    int side2 = 10;
    int side3 = 15;

    if (side1 == side2 && side2 == side3) {
      System.out.println("Equilateral Triangle");
    } else if (side1 == side2 || side2 == side3 || side3 == side1) {
      System.out.println("Isosceles Triangle");
    } else {
      System.out.println("Scalene Triangle");
    }
  }
}
