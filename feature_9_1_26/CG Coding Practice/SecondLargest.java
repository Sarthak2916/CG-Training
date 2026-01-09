package feature_9_1_26;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int largest= Integer.MIN_VALUE;
        int sLargest= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        System.out.println("second Largest is: "+sLargest);
    }
}
