package feature_9_1_26;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2Pointer {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int i=0,j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("reversed arr: "+ Arrays.toString(arr));
    }
}
