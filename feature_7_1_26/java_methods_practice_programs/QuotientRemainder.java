package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient= number/divisor;
        int remainder= number%divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int result1[]= findRemainderAndQuotient(num1,num2);
        int result2[]= findRemainderAndQuotient(num2,num1);
        System.out.println("Quotient and remainder of "+num1+" and "+num2+" is "+ result1[0]+" "+result1[1]);
        System.out.println("Quotient and remainder of "+num2+" and "+num1+" is "+ result2[0]+" "+result2[1]);
    }
}
