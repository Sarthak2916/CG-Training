package feature_9_1_26;

import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        String result=str.replace(" ","/");
        System.out.println(result);
    }
}
