package feature_30_1_26;

public class RotatedSortedArray {

    public static void main(String[] args) {

        int arr[]={4,5,6,7,1};
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println(mid);
    }
}