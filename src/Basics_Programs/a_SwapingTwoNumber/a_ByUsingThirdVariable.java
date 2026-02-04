package Basics_Programs.a_SwapingTwoNumber;

public class a_ByUsingThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        System.out.print("Before Swaping a="+a+" and b="+b);
        // Using Third Variable
        int z;
        z=a;
        a=b;
        b=z;
        System.out.print("\nAfter Swaping a="+a+" and b="+b);
    }
}
