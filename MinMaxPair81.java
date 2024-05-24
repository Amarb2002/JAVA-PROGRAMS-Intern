import java.util.Arrays;

public class MinMaxPair81 {

    // Method to find the minimum and maximum values in an array
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Create an array to hold the minimum and maximum values
        int[] minMaxPair = {min, max};
        return minMaxPair;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15, 2, 7};

        // Call the findMinMax method and store the result
        int[] result = findMinMax(numbers);

        // Display the minimum and maximum values
        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }
}
