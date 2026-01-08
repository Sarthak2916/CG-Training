package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class Palindrome {
    static boolean Logic1(String s){
        int start=0;
        int end= s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean Logic2(String s){
        return recursiveCheck(s,0,s.length()-1);
    }
    static boolean Logic3(String s){
        char []charArr= s.toCharArray();
        char []revCharArr= reverseStringToArr(s);
        for(int i=0;i<s.length();i++){
            if(charArr[i]!=revCharArr[i]) return false;
        }
        return true;
    }
    static boolean recursiveCheck(String s, int start, int end){
        if(start>end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return recursiveCheck(s,start+1,end-1);
    }
    static char[] reverseStringToArr(String s){
        char []arr= new char[s.length()];
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            arr[c]=s.charAt(i);
            c++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        boolean result1= Logic1(str);
        boolean result2= Logic2(str);
        boolean result3= Logic3(str);
        System.out.println("Is given string palindrome using Logic1: "+result1);
        System.out.println("Is given string palindrome using Logic2: "+result2);
        System.out.println("Is given string palindrome using Logic3: "+result3);

    }
}
