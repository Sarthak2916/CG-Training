package feature_5_1_26.java_control_flow_level_2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        if(num<=0);
        else{
            for(int i=1;i<=num;i++){
                if(i%3==0) System.out.print("Fizz");
                if(i%5==0) System.out.print("Buzz");
                if(i%3!=0 && i%5!=0) System.out.print(i);
                System.out.println();
            }
        }
    }
}
