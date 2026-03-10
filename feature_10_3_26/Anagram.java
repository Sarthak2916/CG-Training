package CG_Engineers.M1Test;

import javax.swing.*;

public class Anagram {

    static boolean checkAnagram(String a, String b){
        if(a.length()!=b.length()) return false;
        int aFArr[]= new int[26];
        int bFArr[]= new int[26];

        for(int i=0;i<a.length();i++){
            aFArr[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            bFArr[b.charAt(i)-'a']++;
        }
        for(int i=0;i<aFArr.length;i++){
            if(aFArr[i]!=bFArr[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String a= "build";
        String b= "dubil";

        System.out.println(checkAnagram(a,b));
    }
}
