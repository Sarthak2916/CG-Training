package feature_6_1_26.java_arrays_level_1;

import java.util.Arrays;
import java.util.Scanner;

public class Convert2Dto1D {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int rows= input.nextInt();
        int columns= input.nextInt();
        int[][]arr= new int[rows][columns];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= input.nextInt();
            }
        }
        //converted 1D array
        int[]convertedArr= new int[rows*columns];
        //index to keep track of 1D elements
        int index=0;
        //adding elements of 2D array to 1D array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    convertedArr[index]=arr[i][j];
                    index++;
            }
        }
        //printing converted 1D array
        System.out.println(Arrays.toString(convertedArr));
    }
}
