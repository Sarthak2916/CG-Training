package CG_Engineers.M1Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Ques6 {
    public static int findSum(int[] arr) {

        if(arr.length == 0 || arr.length <= 3)
            return 0;

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int secondLargestEven = even.get(even.size() - 2);
        int secondSmallestOdd = odd.get(1);

        return secondLargestEven + secondSmallestOdd;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        System.out.println(findSum(arr));
    }
}
