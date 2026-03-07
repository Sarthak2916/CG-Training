package CG_Engineers.OtherQuestions;

public class AbsoluteSumDifference {

    public static void main(String[] args) {

        int []arr= {12,13,17,9,52,10};
        int num=13;
        int diff=4;

        int count=0;

        for(int i=0;i<arr.length;i++)
            if(Math.abs(num-arr[i])<=diff) count++;

        System.out.println(count);

    }
}
