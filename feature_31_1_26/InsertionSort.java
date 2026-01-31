package feature_31_1_26;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[]={5,3,9,1,0};
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int k=arr[i];
            while(j!=-1 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
            System.out.println(Arrays.toString(arr));
        }

    }
}
