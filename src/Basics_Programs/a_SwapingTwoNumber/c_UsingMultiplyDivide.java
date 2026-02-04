package Basics_Programs.a_SwapingTwoNumber;

public class c_UsingMultiplyDivide {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swaping :"+a + " " + b);
        // operations
        a =a*b;
        b =a/b;
        a =a/b;
        System.out.println("After Swaping :"+a + " " + b);
        // fail for any number is 0 and overflow risk
    }
}
