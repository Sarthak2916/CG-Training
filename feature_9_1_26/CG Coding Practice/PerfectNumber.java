package feature_9_1_26;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int count=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count+=i;
            }
        }
        if(count==n) System.out.println("Perfect no.");
        else System.out.println("Not a Perfect no.");
    }
}
