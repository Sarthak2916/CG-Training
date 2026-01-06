package feature_6_1_26.java_arrays_level_2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        //calculating length of number
        int len= String.valueOf(num).length();
        int arr[]= new int[len];
        int fArr[]= new int[10];
        int temp=num;
        int i=len-1;
        //adding digits of the number to array
        while(temp>0){
            arr[i]=temp%10;
            i--;
            temp/=10;
        }
        //calculating frequency of digits
        for(int l=0;l<len;l++){
            fArr[arr[l]]++;
        }
        //printing digits and their respective frequency
        for(int l=0;l<10;l++){
            if(fArr[l]>0)
            System.out.println("Frequency of digit "+l+" is "+fArr[l]);
        }
    }
}
