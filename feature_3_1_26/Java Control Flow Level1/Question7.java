package feature_3_1_26;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String month= input.nextLine();
        int day= input.nextInt();
        if((month.equals("march") && day>=20) || month.equals("april") || month.equals("may") || (month.equals("june") && day<=20)){
            System.out.println("It's a Spring Season");
        }
        else System.out.println("Not a Spring Season");
    }
}
