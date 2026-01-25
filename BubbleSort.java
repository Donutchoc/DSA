// Standard Bubble Sort algorithm
public class BubbleSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length; // Number of elements

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // If current element is greater than next, swap them
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array elements
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}