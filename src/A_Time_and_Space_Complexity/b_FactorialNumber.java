package A_Time_and_Space_Complexity;

public class b_FactorialNumber {
    public static void main(String[] args){
        int n=5;    // 1 unit
        int fact =1;   // 1 unit

        for(int i =1; i<=n; i++){     // n  unit
            fact *= i;
        }
        System.out.println("Factorial of "+n+" :"+fact);   // 1 unit

        // f(n) = 2 + n +1
        // f(n) = 3 + n
        //  f(n) = n
    }
}
