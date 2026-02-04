package Basics_Programs.a_SwapingTwoNumber;

public class b_UsingArithemeticOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.print("Before Swaping a="+x+" and b="+y);
        // now swaping is performed here
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("\nAfter Swaping a="+x+" and b="+y);
      //  Can cause integer overflow if numbers are large.
    }
}
