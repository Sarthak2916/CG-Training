package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class CompareStrings {
    public static boolean isEqual(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("Strings are not equal");
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s1= input.next();
        String s2= input.next();
        boolean result= isEqual(s1,s2);
        if(result==s1.equals(s2)) System.out.println("Both user method and Built-in methods shows the same result: "+result);
        else System.out.println("Both show different results, user method: "+result+" built-in method: "+s1.equals(s2));
    }
}
