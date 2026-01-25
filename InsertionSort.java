// Insertion Sort algorithm
public class InsertionSort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Loop starts from second element
        for (int i = 1; i < n; i++) {

            int key = arr[i]; // Element to be inserted
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }

    // Print array
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}