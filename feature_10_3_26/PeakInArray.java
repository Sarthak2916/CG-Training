package CG_Engineers.M1Test;

public class PeakInArray {

    static int findPeak(int[] arr){
        if(arr.length==1 || arr[0]>arr[1]) return arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
    public static void main(String[] args) {

        int []arr= {3,4,5,6,5};

        int peak= findPeak(arr);
        System.out.println(peak);
    }
}
