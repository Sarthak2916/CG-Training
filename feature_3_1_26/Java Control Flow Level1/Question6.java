package feature_3_1_26;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        if(number>0) System.out.println("positive");
        else if(number<0) System.out.println("negative");
        else System.out.println("zero");
    }
}
