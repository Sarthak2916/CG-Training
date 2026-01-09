package feature_9_1_26;

import java.util.Scanner;

public class CharFrequency {
    static int[] checkFrequency(String s){
        int []arr= new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-97]++;
        }
        return arr;
    }
    static void displayFrequency(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println("Frequency of "+(char)(i+97)+" is "+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        int []fArr=checkFrequency(str);
        displayFrequency(fArr);
    }
}
