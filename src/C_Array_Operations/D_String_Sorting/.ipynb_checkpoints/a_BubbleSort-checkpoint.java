package C_Array_Operations.D_String_Sorting;

public class a_BubbleSort {
    public  static void main(String[] args) {
        String[] arr = {"manish", "shivam", "ashmit", "chetan", "ashish", "mayank", "ratnesh"};
        String temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print the sorted array.....
        for (String str : arr) {
            System.out.print(str+" ");
        }
    }
}

