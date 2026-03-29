package H_SlidingWindowTechniques;

import java.util.Scanner;

public class g_FindPatterInStrings {
    public int findPattern(String s, String p) {
        int n = s.length();
        int m = p.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        g_FindPatterInStrings obj=new g_FindPatterInStrings();
        System.out.println(obj.findPattern(s1,s2));;
    }
}
