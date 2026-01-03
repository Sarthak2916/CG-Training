package feature_3_1_26;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input= new Scanner(System.in);
        boolean flag=false;
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();
        if(num1<num2 && num1<num3) flag=true;
        System.out.println("Is the first number the smallest? "+flag);
    }
}
