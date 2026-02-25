package mocktest;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

        String s="abcabcbb";
        int len=0, maxLen=Integer.MIN_VALUE;
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                len++;
                set.add(ch);
            } else {
                maxLen=Math.max(len,maxLen);
                set= new HashSet<>();
                len=0;
            }
        }
        System.out.println(maxLen);
    }
}
