package feature_5_1_26.java_control_flow_level_3;

import java.util.*;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int count= String.valueOf(num).length();
        int temp=num;
        int digit=0;
        while(temp>0){
            int val=temp%10;
            digit+= Math.pow(val,count);
            temp/=10;
        }
        if(digit==num) System.out.println("armstrong no.");
        else System.out.println("not armstrong no.");


    }
}
