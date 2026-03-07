package CG_Engineers.OtherQuestions;

public class ArrayEquilibrium {
    public static void main(String[] args) {

        int nums[]= {1,1,1,1,1,4};
        int result=0;
        int total=0;
        for(int x: nums){
            total+=x;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum*2==total-nums[i]){
                result=i;
                break;
            }
            leftSum+=nums[i];
        }
        System.out.println(result);

    }
}
