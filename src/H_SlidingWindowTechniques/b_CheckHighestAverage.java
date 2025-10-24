package H_SlidingWindowTechniques;

import java.util.Scanner;

public class b_CheckHighestAverage {
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

        System.out.print("Enter days to Calculate Average of it: ");
        int days=sc.nextInt();
        int windowSum =0;
        int avg=0;
        for(int i=0; i<days; i++){
            windowSum = windowSum+arr[i];
        }
        avg = (windowSum)/days;
        System.out.println("Average :"+avg);

        int max = windowSum;

        for(int i=1; i<=length-days; i++){
            windowSum = windowSum + arr[i+days-1] -arr[i-1];
            if(windowSum>max){
                max=windowSum;
            }
        }
        avg = (windowSum)/days;
        System.out.println("Average :"+avg);

        System.out.println("Highest people in Days: "+windowSum);
    }
}
