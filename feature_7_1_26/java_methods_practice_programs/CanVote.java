package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class CanVote {
    public static boolean canVote(int age){
        if(age>=18) return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int []arr= new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.println("invalid age");
            else if(canVote(arr[i])) System.out.println("Student with the age "+arr[i]+" can vote");
            else System.out.println("Student with the age "+arr[i]+" cannot vote");
        }
    }
}