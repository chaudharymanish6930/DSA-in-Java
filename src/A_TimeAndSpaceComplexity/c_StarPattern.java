package A_TimeAndSpaceComplexity;

public class c_StarPattern {
    public static void main(String[] args){
        int n=5;   // // 1 unit

        for(int i=1; i<=n; i++){   // n unit
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        f(n) = 1 + 2 + 3 + 4 +..... +n = n(n+1)/2
//        f(n) = (n^2)/2 + (n)/2
//        f(n) = n^2 + n
//        f(n) = n^2  (n*n)
    }
}
