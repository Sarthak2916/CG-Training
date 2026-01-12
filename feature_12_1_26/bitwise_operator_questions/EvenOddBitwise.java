package feature_12_1_26.bitwise_operator_questions;

import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
