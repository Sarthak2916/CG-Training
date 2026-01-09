package feature_9_1_26;

import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
        }
        System.out.println(count);
    }
}
