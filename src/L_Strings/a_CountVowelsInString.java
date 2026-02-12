package L_Strings;

import java.util.Scanner;

public class a_CountVowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s= sc.nextLine();

        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
                count++;
            }
        }

        System.out.print("Total vowels: "+count);
    }
}
