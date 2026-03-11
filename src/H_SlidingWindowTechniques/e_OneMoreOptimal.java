package H_SlidingWindowTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class e_OneMoreOptimal {
    public static double SubArray(int[] arr, int k){
        ArrayList<Double> list=new ArrayList<>();
        int start=0;
        double sum=0;
        for(int end=start; end<arr.length; end++){
            if(end<k){
                sum+=arr[end];
            }
            if(end>=k){
                list.add(sum);
                sum+=arr[end];
                sum-=arr[end];
                start++;
            }
        }
        double big=Collections.max(list);
        return big;
    }
    public static void main(String[] args) {
        e_OneMoreOptimal obj=new e_OneMoreOptimal();
        Scanner sc= new Scanner(System.in);
        System.out.print("Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element in array: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter the Subarray Length: ");
        int k=sc.nextInt();
        System.out.println(obj.SubArray(arr,k));
    }
}
