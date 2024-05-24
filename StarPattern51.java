public class StarPattern51 {
    public static void main(String[] args) {
        int n = 6; // Set the number of rows

        // Loop to iterate over rows
        for (int i = 1; i <= n; i++) {
            // Loop to print spaces before the '*'
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Loop to print '*' in each column
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after each row
        }

        // Loop to iterate over rows in reverse order
        for (int i = n - 1; i >= 1; i--) {
            // Loop to print spaces before the '*'
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // Loop to print '*' in each column
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
