package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class ToLowerCaseComparison {
    static boolean compareBothLowers(String s1, String s2){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    static String convertToLower(String str){
        String lower="";
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch+=32;
                lower+=ch;
            }
            else lower+=ch;
        }
        return lower;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        String uLowerCase= convertToLower(str);
        String bLowerCase= str.toLowerCase();
        boolean result= compareBothLowers(uLowerCase,bLowerCase);
        if(result) System.out.println("Both results are equal: "+uLowerCase);
        else System.out.println("Both results are different: "+uLowerCase+"\t"+bLowerCase);

    }
}
