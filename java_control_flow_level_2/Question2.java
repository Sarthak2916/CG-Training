package feature_5_1_26.java_control_flow_level_2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int salary, year;
        salary=input.nextInt();
        year= input.nextInt();
        int bonus=0;
        if(year>5){
            bonus= salary*5/100;
        }
        System.out.println(bonus);
    }
}
