package mocktest;

public class BalancedSplitCheck {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,10};
        int sum1=0,sum2=0;

        int i=0,j=arr.length-1;
        while(i<=j){
            if(sum1<=sum2){
                sum1+=arr[i++];
            } else {
                sum2+=arr[j--];
            }
        }
        if(sum1==sum2) System.out.println("Yes");
        else System.out.println("No");
    }
}
