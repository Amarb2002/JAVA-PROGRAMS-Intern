public class PalindromeChecker79 {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String processedStr = str.replaceAll("\\s+", "").toLowerCase();

        // Check if the string is a palindrome
        int left = 0;
        int right = processedStr.length() - 1;

        while (left < right) {
            if (processedStr.charAt(left) != processedStr.charAt(right)) {
                return false; // Characters at left and right positions are different
            }
            left++;
            right--;
        }
        return true; // String is a palindrome
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define a string to check for palindrome
        String str = "Madam";

        // Call the isPalindrome method and store the result
        boolean isPal = isPalindrome(str);

        // Display the result
        if (isPal) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
