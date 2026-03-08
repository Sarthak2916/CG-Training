package CG_Engineers.M1Practice;

public class Ques5 {

    static int differenceOfSum(int n, int m){
        int divN=0, nDivN=0;
        for(int i=1;i<=m;i++){
            if(i%n==0) divN+=i;
            else nDivN+=i;
        }
        return nDivN-divN;
    }
    public static void main(String[] args) {

        int n=4;
        int m=20;

        int result=differenceOfSum(n,m);

        System.out.println(result);
    }
}
