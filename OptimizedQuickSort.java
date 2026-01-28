// Optimized Quick Sort Algorithm
public class OptimizedQuickSort {

    // Method to perform quick sort on array
    static void quickSort(int[] arr, int low, int high) {

        // Continue sorting while subarray has more than one element
        while (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recur on the smaller subarray to reduce recursion depth
            if (pivotIndex - low < high - pivotIndex) {
                quickSort(arr, low, pivotIndex - 1);
                low = pivotIndex + 1; // Tail recursion elimination
            } else {
                quickSort(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    // Partition method places pivot in correct position
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;       // Index of smaller element

        // Traverse through array
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Utility method to print array
    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}