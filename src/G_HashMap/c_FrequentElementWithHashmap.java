package G_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c_FrequentElementWithHashmap {
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

        // HashMap Concept is here
        Map<Integer,Integer> freq = new HashMap<Integer, Integer>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }

        System.out.println("Frequency Map: ");
        System.out.println(freq.entrySet());
        int maxfre =0;
        int anskey = -1;
        for(var e:freq.entrySet()){
            if(e.getValue()>maxfre){
                maxfre = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
    }
}
