package feature_9_1_26;

import java.util.Scanner;

public class CapitalFirstLetter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.next();
        char ch=str.charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("already has capital letter");
            return;
        }
        ch-=32;
        String result=ch+"";
        result+=str.substring(1,str.length());
        System.out.println(result);
    }
}
