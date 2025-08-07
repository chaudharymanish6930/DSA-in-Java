package C_Array_Operations.A_Basic_Operations;

public class a_TraversalOfArray {
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};

        // for loop
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // for each loop
        for(int n:arr){
            System.out.println(n);
        }
    }
}
