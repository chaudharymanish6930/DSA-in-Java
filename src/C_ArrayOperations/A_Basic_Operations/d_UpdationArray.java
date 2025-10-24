package C_ArrayOperations.A_Basic_Operations;
 import java.util.Scanner;
public class d_UpdationArray {
    public static void main(String[] args){
        int arr[] = {10,20,30,30,40};
        System.out.println("Before updation: ");
        for(int no: arr){
            System.out.print(no+" ");
        }
        System.out.println();

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the index to be upadted :");
        int index= scanner.nextInt();

        int element = 50;

        arr[index]=element;

        System.out.println("After updation :");

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
