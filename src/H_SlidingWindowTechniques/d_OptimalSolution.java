package H_SlidingWindowTechniques;

import java.util.Scanner;

public class d_OptimalSolution {
    public static double SubArray(int[] arr, int k){
        int sum =0;
        int max=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k; i<arr.length; i++){
            sum+=arr[i];
            sum-=arr[i-k];
            max=Math.max(sum,max);
        }
        return max/k;
    }
    public static void main(String[] args) {
        d_OptimalSolution obj= new d_OptimalSolution();
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
