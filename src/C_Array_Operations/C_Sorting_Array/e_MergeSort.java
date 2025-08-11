package C_Array_Operations.C_Sorting_Array;

public class e_MergeSort {
    int[] array;
    int length;
    int[] tempArray;
    public static void main(String[] args) {
        int[] arr = {13,34,54,67,25,12,29};
        e_MergeSort obj = new e_MergeSort();
        obj.sort(arr);

        // print the elements
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    public void sort(int[] arr){
        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];
        divideSort(0,length-1);
    }

    public void divideSort(int lowerIndex, int higherIndex){
        if(lowerIndex < higherIndex){
            int middle = (lowerIndex+higherIndex)/2;

            //  left sorting
            divideSort(lowerIndex,middle);

            // right sorting
            divideSort(middle+1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex){
        for(int i=lowerIndex; i<=higherIndex; i++){
            tempArray[i] = array[i];
        }

        int i =lowerIndex;
        int j= middle+1;
        int k= lowerIndex;

        while(i<=middle && j<=higherIndex){
            if(tempArray[i] < tempArray[j]){
                array[k] =tempArray[i];
                i++;
            }
            else{
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = tempArray[i];
            k++;
            i++;
        }
        while(j<+higherIndex){
            array[k] = tempArray[j];
            k++;
            j++;
        }
    }
}
