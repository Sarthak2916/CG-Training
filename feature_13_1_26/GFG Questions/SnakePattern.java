package feature_13_1_26.gfg_questions;

import java.util.Scanner;
import java.util.ArrayList;

public class SnakePattern {

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int count=1;
        for(int i=0;i<matrix.length;i++){
            if(count%2==0){
                for(int j=matrix[i].length-1;j>=0;j--){
                    list.add(matrix[i][j]);
                }
            }
            else {
                for(int j=0;j<matrix[i].length;j++){
                    list.add(matrix[i][j]);
                }
            }
            count++;
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        int m=input.nextInt();
        int[][] arr= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= input.nextInt();
            }
        }

        ArrayList<Integer> result= snakePattern(arr);
        System.out.println(result);
    }
}

