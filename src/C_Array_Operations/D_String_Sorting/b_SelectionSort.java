package C_Array_Operations.D_String_Sorting;

public class b_SelectionSort {
    public static void main(String[] args) {
        String[] arr = {"manish", "shivam", "ashmit", "chetan", "ashish", "mayank", "ratnesh"};
        int size = arr.length;
        String temp;
        for (int i = 0; i < size; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                // here resiprocal then string also string..
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // swapping...
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println(arr[i]+" ");

        }

        System.out.println();
        for (String n : arr) {
            System.out.print(n + " ");
        }
    }

}
