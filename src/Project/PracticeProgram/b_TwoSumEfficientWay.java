package Project.PracticeProgram;

import java.util.Scanner;

public class b_TwoSumEfficientWay {
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

        int start =0;
        int end = length-1;
        System.out.print("You want to find the sum of target: ");
        int target = sc.nextInt();
        // a boolean variable to terminate
        boolean flag = false;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==target){
                System.out.println(start+" "+end);
                flag = true;
                break;
            }
            else if(sum>target){
                end--;
            }
            else{
                start++;
            }
        }
        if(flag){
            System.out.println("Easily Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
