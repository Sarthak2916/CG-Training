package feature_9_1_26;

import java.util.Scanner;

public class PangramString {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String str= input.nextLine();
        int[]arr= new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[ch-97]++;
            }
        }

        for(int x: arr){
            if(x==0){
                System.out.println("Not a Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
