package feature_13_1_26.gfg_questions;

import java.util.Scanner;

public class SumOfDiagonals {

    static int sumDiagonal(int N, int[][] M) {
        // Write your code here
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<=i;j++){
                sum+=M[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n= input.nextInt();
        int [][]arr= new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }

        int result= sumDiagonal(n,arr);
        System.out.println(result);
    }
}
