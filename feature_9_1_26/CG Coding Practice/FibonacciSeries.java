package feature_9_1_26;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int a=0,b=1,c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
