package CG_Engineers.M1Practice;

public class Ques7 {
    public static int productSmallestPair(int sum, int arr[]) {

        int n = arr.length;

        if(n < 2)
            return -1;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            if(arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i] < min2) {
                min2 = arr[i];
            }
        }

        if(min1 + min2 <= sum)
            return min1 * min2;

        return 0;
    }

    public static void main(String[] args) {

        int arr[] = {9,8,3,7,3,9};
        int sum = 4;

        System.out.println(productSmallestPair(sum, arr));
    }
}
