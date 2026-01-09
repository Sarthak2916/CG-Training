package feature_9_1_26;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    static void rotateArray(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        rotateArray(arr);
    }
}
