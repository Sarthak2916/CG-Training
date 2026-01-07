package feature_7_1_26.java_methods_practice_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class GenerateOTP {
    public static int[] generateOTP(){
        int[]arr= new int[10];
        Random random= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(5001)+1000;
        }
        return arr;
    }
    public static boolean isUnique(int arr[]){
        HashSet<Integer> set= new HashSet<>();
        for(int i: arr){
            if(set.contains(i)) return false;
            set.add(i);
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[];
        arr=generateOTP();
        System.out.println("OTPs generated are "+ Arrays.toString(arr)+"\nare OTP generated unique? "+isUnique(arr));
    }
}
