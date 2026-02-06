package feature_6_2_26;

import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b= sc.nextInt();

            int result= a/b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Operation Completed");
        }
    }
}
