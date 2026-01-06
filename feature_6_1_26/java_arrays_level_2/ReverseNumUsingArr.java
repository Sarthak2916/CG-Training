package feature_6_1_26.java_arrays_level_2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumUsingArr {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        //calculating length of number
        int length= String.valueOf(num).length();
        int arr[]= new int[length];
        int i=0;
        //adding number digits in array in reverse order
        while(num>0){
            arr[i]=num%10;
            num/=10;
            i++;
        }
        //printing digits
        for(int l=0;l<length;l++){
            System.out.print(arr[l]);
        }
    }
}
