package feature_6_1_26.java_arrays_level_1;

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int []arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        //Printing whether a person can vote or not from the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.println("invalid age");
            else if(arr[i]>=18) System.out.println("Student with the age "+arr[i]+" can vote");
            else System.out.println("Student with the age "+arr[i]+" cannot vote");
        }
    }
}
