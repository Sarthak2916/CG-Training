package feature_3_1_26;

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double total=0;
        double userValue=1;
        while(userValue!=0){
            userValue=input.nextDouble();
            total+=userValue;
        }
        System.out.println(total);
    }
}
