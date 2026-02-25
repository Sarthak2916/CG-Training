package mocktest;

import java.util.Arrays;

public class OddIndexStability {

    public static void main(String[] args) {

        int arr[]= {10,20,30,40,50,60};
        int evenArr[]= new int[arr.length/2];
        int count=0;
        for(int i=0;i<arr.length;i+=2){
            evenArr[count++]=arr[i];
        }
        int ele= evenArr[evenArr.length-1];
        for(int i=0;i<evenArr.length-1;i++){
            int temp=evenArr[i+1];
            evenArr[i+1]=evenArr[i];
        }
        count=0;
        for(int i=0;i<arr.length;i+=2){
            arr[i]=evenArr[count];
        }
        System.out.println(Arrays.toString(arr));

    }
}
