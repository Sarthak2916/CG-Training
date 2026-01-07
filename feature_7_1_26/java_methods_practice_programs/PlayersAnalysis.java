package feature_7_1_26.java_methods_practice_programs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayersAnalysis {
    public static int sum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static double mean(int sum, int size){
        return sum/size;
    }
    public static int shortest(int[]arr){
        int shortest= Integer.MAX_VALUE;
        for(int i: arr){
            shortest=Math.min(shortest,i);
        }
        return shortest;
    }
    public static int tallest(int[]arr){
        int tallest= Integer.MIN_VALUE;
        for(int i: arr){
            tallest=Math.max(tallest,i);
        }
        return tallest;
    }

    public static int[] randomHeight(int minRange, int maxRange){
        int[]arr= new int[11];
        Random random= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(minRange)+maxRange-minRange+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int minRange=150;
        int maxRange=250;
        int[]arr= randomHeight(minRange,maxRange);
        int sum=sum(arr);
        System.out.println("Football team players height generated is: "+ Arrays.toString(arr));
        System.out.println("Sum of all heights is: "+sum);
        System.out.println("Mean of all heights is: "+mean(sum,arr.length));
        System.out.println("Shortest height is: "+shortest(arr));
        System.out.println("Tallest height is: "+tallest(arr));
    }
}
