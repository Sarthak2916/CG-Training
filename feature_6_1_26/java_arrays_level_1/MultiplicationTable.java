package feature_6_1_26.java_arrays_level_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int arr[]= new int[10];
        //storing table value of num in array
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1]= i*num;
        }
        //printing multiplication table of num using array
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(num+"*"+i+"="+arr[i-1]);
        }
    }
}
