package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class Anagram {
    static boolean areAnagrams(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int[] fArr1= new int[26];
        int[] fArr2= new int[26];
        for(int i=0;i<s1.length();i++){
            int val=s1.charAt(i);
            val-=97;
            fArr1[val]++;
        }
        for(int i=0;i<s2.length();i++){
            int val=s1.charAt(i)-97;
            fArr2[val]++;
        }
        for(int i=0;i<fArr1.length;i++){
            if(fArr1[i]!=fArr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        boolean result= areAnagrams(s1,s2);
        if(result) System.out.println("Both String are Anagrams");
        else System.out.println("Both String are not Anagrams");

    }
}
