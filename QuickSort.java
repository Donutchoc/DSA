// Quick Sort Algorithm
// Uses partitioning and recursion

public class QuickSort {

    // Main quick sort method
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};

        quickSort(data, 0, data.length - 1);

        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
