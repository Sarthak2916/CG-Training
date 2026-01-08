package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class FindSubstring {
    public static String getSubstring(String s1,int start, int end){
        String str="";
        for(int i=start;i<end;i++){
            str+=s1.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s1= input.next();
        int start= input.nextInt();
        int end= input.nextInt();
        String uSubstring= getSubstring(s1,start,end);
        String bSubstring= s1.substring(start,end);
        if(uSubstring.equals(bSubstring)) System.out.println("Both user method and Built-in methods shows the same result: "+uSubstring);
        else System.out.println("Both show different results, user method: "+uSubstring+" built-in method: "+bSubstring);
    }
}
