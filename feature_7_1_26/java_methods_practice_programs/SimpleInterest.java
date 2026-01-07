package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double principal=input.nextDouble();
        double rate=input.nextDouble();
        double time=input.nextDouble();
        double si= calculateSI(principal,rate,time);
        System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate
                +" and Time "+time);
    }
    static double calculateSI(double p, double r, double t){
        double result= p*r*t/100;
        return result;
    }
}
