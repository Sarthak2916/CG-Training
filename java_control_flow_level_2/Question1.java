package feature_5_1_26.java_control_flow_level_2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num = input.nextInt();
        if(num<=0) System.out.println("not a natural number");
        else{
            for(int i=1;i<=num;i++){
                if(i%2==0) System.out.println(i+" is even");
                else System.out.println(i+" is odd");
            }
        }
    }
}
