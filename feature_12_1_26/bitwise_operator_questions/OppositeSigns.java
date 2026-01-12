package feature_12_1_26.bitwise_operator_questions;

import java.util.Scanner;

public class OppositeSigns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        if ((x ^ y) < 0) {
            System.out.println("Numbers have opposite signs");
        } else {
            System.out.println("Numbers do NOT have opposite signs");
        }
    }
}

