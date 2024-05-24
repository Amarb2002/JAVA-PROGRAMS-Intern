public class FibonacciSeries80 {

    // Method to generate Fibonacci series up to a given number of terms
    public static void generateFibonacci(int numTerms) {
        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci series up to " + numTerms + " terms:");

        for (int i = 0; i < numTerms; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println(); // Print a new line after the series
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define the number of terms for the Fibonacci series
        int terms = 10;

        // Call the generateFibonacci method to generate the series
        generateFibonacci(terms);
    }
}
