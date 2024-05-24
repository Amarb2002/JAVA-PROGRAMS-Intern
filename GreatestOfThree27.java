public class GreatestOfThree27 {

  public static void main(String[] args) {
    int num1 = 20;
    int num2 = 3;
    int num3 = 1;

    int largest = num1; // 3

    if (num2 > largest) { // 10 > 3
      largest = num2; // 10
    }
    if (num3 > largest) { //15 > 10
      largest = num3; // 15
    }

    System.out.println("The largest number is: " + largest);
  }
}
