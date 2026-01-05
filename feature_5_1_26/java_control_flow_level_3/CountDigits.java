package feature_5_1_26.java_control_flow_level_3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int count=0;
        int temp=num;
        while(temp>0){
            temp/=10;
            count++;
        }
        System.out.println("no. of digits "+count);
    }
}
