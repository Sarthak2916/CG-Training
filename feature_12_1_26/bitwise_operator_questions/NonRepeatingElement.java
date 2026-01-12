package feature_12_1_26.bitwise_operator_questions;

import java.util.Scanner;

public class NonRepeatingElement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Non-repeating element: " + result);
    }
}
