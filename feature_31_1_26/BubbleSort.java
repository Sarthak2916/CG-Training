package feature_31_1_26;

import java.util.Arrays;

public class BubbleSort {// comparing Adjacent elements. biggest element is pushed to last in first loop.

    public static void main(String[] args) {

        int arr[]={5,3,9,1,0};

        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
