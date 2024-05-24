public class NumberPattern46 {
    public static void main(String[] args) {
        int n = 5; // Set the number of rows

        // Loop to iterate over rows
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
