package C_Array_Operations.C_Sorting_Array;

public class d_InsertionSort {
    public static void main(String [] args){
        int[] arr = {5, 1, 6, 2, 4, 3};
        int temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp; // insert temp in the correct position
        }
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
