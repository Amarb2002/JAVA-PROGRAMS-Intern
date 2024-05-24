public class MaximumFinder78 {

    // Method to find the maximum of two numbers
    public static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1; // num1 is greater
        } else {
            return num2; // num2 is greater or equal
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define two numbers
        int number1 = 10;
        int number2 = 20;

        // Call the findMaximum method and store the result
        int maxNumber = findMaximum(number1, number2);

        // Display the maximum number
        System.out.println("The maximum of " + number1 + " and " + number2 + " is: " + maxNumber);
    }
}
