import java.util.Scanner;

public class SquareRootCalculator 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        double squareRoot = Math.sqrt(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);

        scanner.close();
    }
}
