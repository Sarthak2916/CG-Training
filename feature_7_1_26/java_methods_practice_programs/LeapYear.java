package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0) return true;
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year= input.nextInt();
        boolean result= isLeapYear(year);
        System.out.println("is "+year+", a Leap Year? "+result);
    }
}
