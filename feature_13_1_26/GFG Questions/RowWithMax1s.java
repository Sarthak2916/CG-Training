package feature_13_1_26.gfg_questions;

import java.util.Scanner;

public class RowWithMax1s {

    public static int rowWithMax1s(int[][] arr) {
        // code here
        int index = -1;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                index = i;
                maxSum = sum;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int result = rowWithMax1s(arr);
        System.out.println(result);
    }
}
