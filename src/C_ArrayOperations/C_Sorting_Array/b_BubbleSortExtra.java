package C_ArrayOperations.C_Sorting_Array;

public class b_BubbleSortExtra {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Track if any swapping happened in this pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 191, 90};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr); // Call sorting function

        System.out.println("\n\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
