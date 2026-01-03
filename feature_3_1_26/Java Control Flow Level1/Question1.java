package feature_3_1_26;

import java.util.Scanner;

public class Question1 {
    static int val=5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int remainder= number%val;
        if(remainder==0) System.out.println("Is the number "+number+" divisible by 5? Yes");
        else System.out.println("Is the number "+number+" divisible by 5? No");
    }
}
