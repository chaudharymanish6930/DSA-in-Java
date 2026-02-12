package L_Strings;

import java.util.Scanner;

public class c_StringInFunction {
    public static void change(String s){
        s="I am Don of the Area";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s= sc.nextLine();
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
