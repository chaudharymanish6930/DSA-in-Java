package G_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class d_Anagram {
    static HashMap<Character, Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String t = sc.nextLine();
        d_Anagram obj1 = new d_Anagram();
        boolean opt=obj1.isAnagram(s,t);
        if(opt) {
            System.out.println("string is Anagram");
        }
        else{
            System.out.println("String is not Anagram");
        }
    }
}
