// Optimized Insertion Sort Algorithm
// This version avoids unnecessary swaps by shifting elements

public class OptimizedInsertionSort {

    // Method to perform optimized insertion sort
    public static void insertionSort(int[] arr) {

        // Start from the second element
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];     // Element to be placed correctly
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key in its correct position
            arr[j + 1] = key;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3};

        insertionSort(data);

        // Print sorted array
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
