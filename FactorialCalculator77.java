public class FactorialCalculator77 {

    // Recursive method to calculate factorial
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return number * calculateFactorial(number - 1); // Recursive call to calculate factorial
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define a number for which factorial needs to be calculated
        int num = 5;

        // Call the calculateFactorial method and store the result
        long factorial = calculateFactorial(num);

        // Display the result
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
