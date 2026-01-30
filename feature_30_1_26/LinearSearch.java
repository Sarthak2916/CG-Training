package feature_30_1_26;

public class LinearSearch {

    static int findIndex(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,5,-1};

        int negativeIndex=findIndex(arr);

        System.out.println(negativeIndex);
    }
}
