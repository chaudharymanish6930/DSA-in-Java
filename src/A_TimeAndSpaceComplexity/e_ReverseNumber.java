package A_TimeAndSpaceComplexity;

import java.util.Scanner;
public class e_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // Get last digit
            reversed = reversed * 10 + digit;  // Append digit
            number = number / 10;         // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
