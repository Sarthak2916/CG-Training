package CG_Engineers.OtherQuestions;

public class CarryCount {
    public static void main(String[] args) {

        int num1=45199;
        int num2=34999;
        int left=0;
        int count=0;
        while(num1!=0 || num2!=0){
            int n1=num1%10;
            int n2=num2%10;
            if(left>0) count++;
            left=n1+n2+left-9;
            num1/=10;num2/=10;
        }
        System.out.println(count);


    }
}
