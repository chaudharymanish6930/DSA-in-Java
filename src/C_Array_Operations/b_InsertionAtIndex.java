package C_Array_Operations;

public class b_InsertionAtIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("before insertion: ");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();

        int indexpas = 2;
        int element = 100;

        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < indexpas; i++) {
            newArr[i] = arr[i];
        }

        newArr[indexpas] = element;

        for(int i=indexpas; i<arr.length; i++ ){
            newArr[i+1]= arr[i];
        }
        System.out.println("After insertion:");
        for(int no: newArr){
            System.out.print(no +" ");
        }
    }
}
