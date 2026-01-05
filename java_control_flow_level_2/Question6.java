package feature_5_1_26.java_control_flow_level_2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int amarAge, akbarAge, anthonyAge;
        int amarHeight,akbarHeight,anthonyHeight;
        amarAge=input.nextInt();
        akbarAge=input.nextInt();
        anthonyAge=input.nextInt();
        amarHeight=input.nextInt();
        akbarHeight=input.nextInt();
        anthonyHeight=input.nextInt();
        String youngest;
        String tallest;
        if(amarAge<akbarAge){
            if(amarAge<anthonyAge) youngest="amar";
            else youngest= "anthony";
        }
        else{
            if(akbarAge<anthonyAge) youngest= "akbar";
            else youngest= "anthony";
        }
        System.out.println(youngest+" is the Youngest");
        if(amarHeight>akbarHeight){
            if(amarHeight>anthonyHeight) tallest="amar";
            else tallest= "anthony";
        }
        else{
            if(akbarHeight>anthonyHeight) tallest= "akbar";
            else tallest= "anthony";
        }
        System.out.println(tallest+" is the tallest");
    }
}
