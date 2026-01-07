package feature_7_1_26.java_methods_practice_programs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static double[] findAverageMinMax(int[]arr){
        double [] result= new double[3];
        result[1]=Integer.MAX_VALUE;
        result[2]=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            result[0]+=arr[i];
            result[1]=Math.min(result[1],arr[i]);
            result[2]=Math.max(result[2],arr[i]);

        }
        result[0]/=arr.length;

        return result;
    }
    public static int[] generate4DigitRandomArray(int size){
        int arr[]=new int[size];
        Random random = new Random();
        for(int i=0;i<size;i++){
            arr[i]=random.nextInt(9000)+1000;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int arr[]=generate4DigitRandomArray(num);
        double[]avgmimx=findAverageMinMax(arr);
        System.out.println("Average, Min and Max, for the given array "+ Arrays.toString(arr)+" is");
        for(int i=0;i<avgmimx.length;i++){
            System.out.print(avgmimx[i]+" ");
        }


    }
}
