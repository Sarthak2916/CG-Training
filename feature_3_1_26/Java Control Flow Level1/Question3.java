package feature_3_1_26;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input= new Scanner(System.in);
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();
        boolean isNum1Largest=false;
        boolean isNum2Largest=false;
        boolean isNum3Largest=false;
        if(num1>num2 && num1>num3) isNum1Largest=true;
        else if(num2>num1 && num2>num3) isNum2Largest=true;
        else if(num3>num1 && num3>num2) isNum3Largest=true;
        System.out.println("Is first number the largest? "+isNum1Largest);
        System.out.println("Is second number the largest? "+isNum2Largest);
        System.out.println("Is third number the largest? "+isNum3Largest);

    }
}
