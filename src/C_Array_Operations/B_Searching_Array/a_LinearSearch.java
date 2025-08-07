package C_Array_Operations.B_Searching_Array;

public class a_LinearSearch {
    public static void main(String[] args){
        int[] arr ={10,34,70,60,50};

        int element= 70;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]== element){
                System.out.println("Element is found at index : "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element is not found...");
        }
    }
}
