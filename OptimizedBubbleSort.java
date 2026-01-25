// Optimized Bubble Sort using a flag to detect already sorted array
public class OptimizedBubbleSort {

    // Method to perform optimized Bubble Sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped; // Flag to check if any swap happened

        // Loop for passes
        for (int i = 0; i < n - 1; i++) {

            swapped = false; // Reset flag for each pass

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break; // Exit early
            }
        }
    }

    // Print array method
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}
