package Basics_Programs.a_SwapingTwoNumber;

public class e_SwapingInOneLine {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping a:"+a+" b:"+b);
        // main line of the program
        a=(a+b)-(b=a);
        System.out.println("After Swapping a:"+a+" b:"+b);
    }
}
