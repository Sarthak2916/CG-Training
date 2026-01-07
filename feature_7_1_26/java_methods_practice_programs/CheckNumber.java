package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class CheckNumber {
    static boolean isPositive(int num){
        if(num>0) return true;
        return false;
    }
    static boolean isEven(int num){
        return num%2==0;
    }
    static void checkNumber(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(isPositive(arr[i])){
                System.out.print("positive number and ");
                if(isEven(arr[i])){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
            else{
                System.out.println("negative number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        checkNumber(arr);
    }
}
