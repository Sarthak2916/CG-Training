package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class VowelsAndConstants {
    static int checkLetter(char ch){
        if(ch>='A' && ch<='Z') ch+=32;
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return 1;
        }
        else if(ch>='a' && ch<='z') return 0;
        else return -1;
    }
    static int[] countVowelsAndConstants(String str){
        int countV=0, countC=0;
        for(int i=0;i<str.length();i++){
            if(checkLetter(str.charAt(i))==1) countV++;
            else if(checkLetter(str.charAt(i))==0) countC++;
        }
        return new int[]{countV,countC};
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        int []vcCount= countVowelsAndConstants(str);
        System.out.println("vowels are: "+vcCount[0]+"\nconstants are: "+vcCount[1]);
    }
}
