package C_ArrayOperations.C_Sorting_Array;

public class f_QuickSortMiddle {
    public static void main(String[] args) {
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int leng = arr.length;

        // create an object for acees the method
        f_QuickSortMiddle obj = new f_QuickSortMiddle();
        obj.QuickSortRecursion(arr , 0, leng-1);

        // print the element
        obj.printArray(arr);
    }
    void QuickSortRecursion(int[] arr, int low, int high){
        int pi = partition(arr,low,high);
        if(low < pi-1){
            QuickSortRecursion(arr, low, pi-1);
        }
        if(pi <high){
            QuickSortRecursion(arr, pi, high);
        }

    }
    int partition(int[] arr , int low, int high){
        int pivot = arr[(low + high)/2];

        while(low<= high){
            while(arr[low] < pivot){
                low++;
            }
        while(arr[high] > pivot){
            high--;
        }
        if(low<=high){
            // swaping
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        }
        return low;
    }
    void printArray(int[] arr){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
