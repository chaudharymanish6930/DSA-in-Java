package Basics_Programs.a_SwapingTwoNumber;

public class d_UsingBitwiseOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swaping a:"+a+" b:"+b);
        // bitwise XOR operator usses
        a = a^b;
        b = a^b;
        a= a^b;
        System.out.print("After Swaping a:"+a+" b:"+b);
    }
}