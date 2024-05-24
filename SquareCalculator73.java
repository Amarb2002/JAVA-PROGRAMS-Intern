public class SquareCalculator73 {

    // Method to calculate the square of a number
    public static int calculateSquare(int number) {
        return number * number;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define a number
        int num = 5;

        // Call the calculateSquare method and store the result
        int square = calculateSquare(num);

        // Display the result
        System.out.println("The square of " + num + " is: " + square);
    }
}
