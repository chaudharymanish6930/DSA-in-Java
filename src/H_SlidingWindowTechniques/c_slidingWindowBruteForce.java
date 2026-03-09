package H_SlidingWindowTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c_slidingWindowBruteForce {
    public static double SubArray(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
//        int[] arr;
        int n=arr.length;
        for(int i=0; i<=n-k; i++){
            int sum=0;
            for(int j=i; j<i+k; j++) {
                sum += arr[j];
            }
            list.add(sum);
        }
        System.out.println(list);
        double largest= Collections.max(list);
        System.out.println(largest);
        double avg=largest/k;

        return avg;
    }
    public static void main(String[] args) {
        c_slidingWindowBruteForce obj= new c_slidingWindowBruteForce();
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
