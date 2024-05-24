public class StarPattern50 {
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
    }
}
