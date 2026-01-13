package feature_13_1_26.gfg_questions;

import java.util.Scanner;
import java.util.ArrayList;

public class SpiralTraverse {

    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        int r=mat.length;
        int c=mat[0].length;
        int tElements=r*c;
        int sRow=0,eCol=c-1,eRow=r-1,sCol=0;
        while(tElements>0){
            for(int i=sCol;i<=eCol;i++){
                list.add(mat[sRow][i]);
                tElements--;
            }
            if(tElements<=0) break;
            sRow++;
            for(int i=sRow;i<=eRow;i++){
                list.add(mat[i][eCol]);
                tElements--;
            }
            if(tElements<=0) break;
            eCol--;
            for(int i=eCol;i>=sCol;i--){
                list.add(mat[eRow][i]);
                tElements--;
            }
            if(tElements<=0) break;
            eRow--;
            for(int i=eRow;i>=sRow;i--){
                list.add(mat[i][sCol]);
                tElements--;
            }
            if(tElements<=0) break;
            sCol++;
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

        ArrayList<Integer> result= spirallyTraverse(arr);
        System.out.println(result);
    }
}
