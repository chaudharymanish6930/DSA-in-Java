package C_Array_Operations;

public class c_DeletionElementArray {
    public static void main(String[] args){
        int[]  arr ={10,20,30,40,50};

        System.out.println("Before deletion: ");
        for(int no: arr){
            System.out.print(no+" ");
        }
        System.out.println(); // skip a line

        int indexPos = 1;

        int[] newArr = new int[arr.length - 1];

        int j=0;
        for(int i =0; i<arr.length; i++ ){
            if(i== indexPos){
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }

        System.out.println("After Deletion: ");
        for(int no:newArr){
            System.out.print(no+" ");
        }
    }
}
