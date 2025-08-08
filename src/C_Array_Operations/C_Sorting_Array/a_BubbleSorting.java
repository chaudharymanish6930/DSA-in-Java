package C_Array_Operations.C_Sorting_Array;

public class a_BubbleSorting {
    public static void main(String[] args){
        int [] arr = {12,32,11,16,9,980,76,57};

        System.out.println("Before sorting: ");
        for(int no:arr){
            System.out.print(no+" ");
        }
        System.out.println();
        int leng = arr.length;

        int temp;
        for(int i=0; i<=leng-1; i++){
            for(int j=0; j<leng-i-1; j++){  // 1 -> i
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int n:arr){
                System.out.print(n+" ");
            }
            System.out.println();
        }

        System.out.println("after sorting: ");
        for(int i=0; i<leng; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
