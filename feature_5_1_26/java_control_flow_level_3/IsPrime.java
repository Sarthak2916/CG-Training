package feature_5_1_26.java_control_flow_level_3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime) System.out.println(num+" is a prime no.");
        else System.out.println(num+" is not a prime no.");
    }
}
