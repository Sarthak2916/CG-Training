package CG_Engineers.M1Test;

import java.util.Arrays;

public class PushZeroes {

    public static void main(String[] args) {

        int []arr= {5,6,0,1,2,0,7,0};

        int i=0,j=0;
        while(j<arr.length){
            if(arr[i]==0){
                if(arr[j]!=0){
                    arr[i]=arr[j];
                    arr[j]=0;
                    i++;
                } else {
                    j++;
                }

            } else {
                i++;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
