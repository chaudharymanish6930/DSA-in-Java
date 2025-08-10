package C_Array_Operations.C_Sorting_Array;

public class c_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 13, 54, 23, 9, 32};
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // swapping...
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println(arr[i]+" ");

        }

        System.out.println();
         for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
