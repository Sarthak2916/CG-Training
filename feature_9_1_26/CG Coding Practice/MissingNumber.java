package feature_9_1_26;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n= input.nextInt();
        int[]arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i+1]!=arr[i]+1){
                System.out.println(arr[i]+1);
                return;
            }
        }
    }
}
