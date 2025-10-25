package G_HashMap;

import java.util.Scanner;

public class b_FrequentElemnetWithoutHashmap {
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

        // sort the given data according to be used;
        int temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted Array of the Element :");
        for(int i:arr){
            System.out.print(i+" ");
        }
        //   both does same work in this code
        //  for(int i=0; i<length; i++){
        //      System.out.print(arr[i]+" ");
        //  }

        int maxfreq=1;
        int current = 1;
        int element = arr[0];
        for(int i=1; i<length; i++){
            if(arr[i]==arr[i-1]){
                current++;
            }
            else{
                current =1;
            }

            if(maxfreq<current){
                maxfreq= current;
                element = arr[i];
            }
        }

        System.out.println("\nMost Frequent Element: " + element);
        System.out.println("Frequency: " + maxfreq);
    }
}
