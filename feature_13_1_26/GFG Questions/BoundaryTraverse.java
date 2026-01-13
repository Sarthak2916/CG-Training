package feature_13_1_26.gfg_questions;

import java.util.Scanner;
import java.util.ArrayList;

public class BoundaryTraverse{

    public static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int r=mat.length;
        int c=mat[0].length;
        int tElements=r*c;
        int sRow=0,eCol=c-1,eRow=r-1,sCol=0;
        int count=0;
        while(count<1){
            for(int i=sCol;i<=eCol;i++){
                list.add(mat[sRow][i]);
            }
            sRow++;
            for(int i=sRow;i<=eRow;i++){
                list.add(mat[i][eCol]);
            }
            eCol--;
            for(int i=eCol;i>=sCol;i--){
                list.add(mat[eRow][i]);
            }
            eRow--;
            for(int i=eRow;i>=sRow;i--){
                list.add(mat[i][sCol]);
            }
            sCol++;
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

        ArrayList<Integer> result= boundaryTraversal(arr);
        System.out.println(result);
    }
}
