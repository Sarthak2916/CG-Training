package feature_6_1_26.java_arrays_level_1;

import java.util.Scanner;

public class NumbersProgram {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        double[]arr= new double[10];
        int index=0;
        //taking input until index runs out or input number is not natural
        while (true){
            if (index>=10) break;
            int num= input.nextInt();
            if(num<=0){
                break;
            }
            arr[index]= num;
            index++;
        }
        double total=0;
        //printing array
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
            total+=arr[i];
        }
        System.out.println(total);
    }
}
