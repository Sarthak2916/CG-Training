package CG_Engineers.M1Practice;

public class Ques4 {

    static int findCount(int []arr, int num, int diff){
        int count=0;

        for(int i=0;i<arr.length;i++)
            if(Math.abs(num-arr[i])<=diff) count++;
        if(count==0) return -1;
        return count;
    }
    public static void main(String[] args) {

        int []arr= {12,13,17,9,52,10};
        int num=13;
        int diff=4;

        int result= findCount(arr,num,diff);
        System.out.println(result);
    }
}
