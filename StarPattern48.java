public class StarPattern48 {
    public static void main(String[] args) {
        int n = 4; // Set the number of rows

        // Loop to iterate over rows
        for (int i = 1; i <= n; i++) {
            // Loop to print '*' in each column
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
