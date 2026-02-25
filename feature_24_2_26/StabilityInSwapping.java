package mocktest;

import java.util.Arrays;

public class StabilityInSwapping {

    public static void main(String[] args) {

        int arr[]= {5,2,9,1,6};

        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
