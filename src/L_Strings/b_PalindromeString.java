package L_Strings;

import java.util.Scanner;

public class b_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s= sc.nextLine();

        int i=0;
        int j=s.length()-1;
        boolean flag=true;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
