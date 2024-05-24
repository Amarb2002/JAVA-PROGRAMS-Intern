public class bubbleSort82 {

    // Method to sort an array of integers in ascending order using bubble sort
    public static void bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // No need to sort if array is empty or has only one element
        }

        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps are done in inner loop, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 8, 15, 2, 7};

        // Call the bubbleSort method to sort the array
        bubbleSort(numbers);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
