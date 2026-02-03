package feature_3_2_26;

import java.util.Arrays;
import java.util.Scanner;

public class GraphAdjacencyMatrix {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<e;i++){
            int u,v;
            u = s.nextInt();
            v = s.nextInt();
            arr[u][v]=1;
            arr[v][u]=1;
        }
        for(int i=0;i<n;i++) System.out.println(Arrays.toString(arr[i]));
    }
}
