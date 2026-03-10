package CG_Engineers.M1Test;

public class FindMissingNumber {

    public static void main(String[] args) {

        int N=7;
        int []arr= {1,2,4,6,3,7,8};
        N++;
        int totalSum= (N*(N+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println(totalSum-sum);
    }
}
