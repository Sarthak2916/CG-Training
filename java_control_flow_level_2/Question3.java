package feature_5_1_26.java_control_flow_level_2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
