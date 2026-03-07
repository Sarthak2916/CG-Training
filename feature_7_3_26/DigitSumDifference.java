package CG_Engineers.OtherQuestions;

public class DigitSumDifference {

    static int digitSumDifference(int m, int n){
        int total4=0,total7=0;
        for(int i=m;i<=n;i++){
            if(i%4==0) total4+=i;
            if(i%7==0) total7+=i;
        }
        int digit4=0,digit7=0;
        while(total4!=0){
            digit4+=total4%10;
            total4/=10;
        }
        while(total7!=0){
            digit7+=total7%10;
            total7/=10;
        }
        return Math.abs(digit4-digit7);
    }

    public static void main(String[] args) {

        int m=50;
        int n=120;
        int result= digitSumDifference(m,n);
        System.out.println(result);
    }
}
