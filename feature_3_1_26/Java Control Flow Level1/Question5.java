package feature_3_1_26;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int age= input.nextInt();
        String vote="can";
        if(age<18) vote="cannot";
        System.out.println("The person's age is "+age+" and "+vote+" vote");
    }
}
