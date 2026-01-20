// Selection Sort Algorithm
// Repeatedly selects the minimum element and places it at the beginning

public class SelectionSort {

    public static void selectionSort(int[] arr) {

        // Traverse through all elements
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i; // Assume current index has minimum

            // Find the minimum element in remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        selectionSort(data);

        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
