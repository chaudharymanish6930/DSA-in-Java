package A_TimeAndSpaceComplexity;

public class d_FibonacciSeries {
    public static void main(String[] args){
        int n=6;

        int first = 0, second = 1;

        for(int i =1; i<=n; i++){
            System.out.print(first + " ");
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

    }
}
