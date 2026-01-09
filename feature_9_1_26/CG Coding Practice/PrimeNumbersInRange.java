package feature_9_1_26;

import java.util.Scanner;

public class PrimeNumbersInRange {
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int minRange= input.nextInt();
        int maxRange= input.nextInt();
        for(int i=minRange;i<=maxRange;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
