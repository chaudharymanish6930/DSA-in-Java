package B_Array;

import java.util.Scanner;
public class b_InputFromUser {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[]  arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the "+i+1+" Element :");
            arr[i] = scanner.nextInt();
        }

        // print all element
        System.out.println("Input array from user:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
