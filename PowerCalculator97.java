import java.util.Scanner;

public class PowerCalculator97 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println("Result: " + result);

        scanner.close();
    }
}
