import java.util.Scanner;

public class RoundToNearestInteger100
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        long roundedNumber = Math.round(number);

        System.out.println("The nearest integer to " + number + " is: " + roundedNumber);

        scanner.close();
    }
}
