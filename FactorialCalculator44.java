import java.util.Scanner;

public class FactorialCalculator44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;// f=f*i
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
