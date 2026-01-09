package feature_9_1_26;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt(), m=input.nextInt();
        int [][]matrix= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
