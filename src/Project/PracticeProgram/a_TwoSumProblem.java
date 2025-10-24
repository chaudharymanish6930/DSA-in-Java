package Project.PracticeProgram;

import java.util.Scanner;

public class a_TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the length of the array: ");
        int length = sc.nextInt();

        int [] arr = new int[length];

        for(int i=0; i<length; i++){
            System.out.print("Enter the elment at index of "+i+" ");
            arr[i]= sc.nextInt();
        }

        System.out.println("The given Array :");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // two sum problem find sum of the tarrget
        System.out.print("You want to find the sum of target: ");
        int target = sc.nextInt();
        // a boolean variable to terminate
        boolean flag = false;
        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    System.out.println("Successfully completed");
                    flag=true;
                }
                if(flag){
                    break;
                }
            }
        }
    }
}
