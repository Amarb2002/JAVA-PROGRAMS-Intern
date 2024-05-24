public class StringReversal83 {

    // Method to reverse a given string
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the input string if it is null or empty
        }

        StringBuilder reversed = new StringBuilder();

        // Append characters from the end of the string to the StringBuilder
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString(); // Convert StringBuilder to String and return
    }

    // Main method to execute the program
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Call the reverseString method and store the result
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
}
