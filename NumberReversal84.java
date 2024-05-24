public class NumberReversal84 {

    // Method to reverse a given number
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int inputNumber = 12345;

        // Call the reverseNumber method and store the result
        int reversedNumber = reverseNumber(inputNumber);

        // Display the reversed number
        System.out.println("Original Number: " + inputNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
