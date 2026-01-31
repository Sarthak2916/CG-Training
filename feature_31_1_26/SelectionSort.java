package feature_31_1_26;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[]={5,3,9,1,0};

        for(int i=0;i<arr.length-1;i++){
            int p=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[p]>arr[j]){
                    p=j;
                }
            }
            int t= arr[p];
            arr[p]=arr[i];
            arr[i]=t;
            System.out.println(Arrays.toString(arr));
        }
    }
}
