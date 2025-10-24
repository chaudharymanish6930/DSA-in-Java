package A_TimeAndSpaceComplexity;

public class a_SwapingTwoNumber {
    public static void main(String [] args){
        int a =10;     // 1 unit
        int b =20;     // 1 unit
        System.out.println("before swapping: "+"a :"+a+" b :"+b);   // 1 unit

        int temp = a;   // 1 unit
         a = b;        // 1 unit
         b =temp;      // 1 unit
        System.out.println("After swapping: "+"a :"+a+" b :"+b);       // 1 unit

        // total unit = 7 unit
        // contstant ignore it means == 1 unit
        // f(n) = 1 unit time

    }
}
