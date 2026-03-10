package CG_Engineers.M1Test;

public class ReverseNumber {

    public static void main(String[] args) {

        int n=2340;

        int revNum=0;

        while(n!=0){
            revNum*=10;
            revNum+=n%10;
            n/=10;
        }

        System.out.println(revNum);
    }
}
