package CG_Engineers.M1Practice;

import java.util.*;

public class Ques15 {

    public static int solve(int arr[]) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int evenSecondLargest = even.get(even.size() - 2);
        int oddSecondLargest = odd.get(odd.size() - 2);

        return evenSecondLargest + oddSecondLargest;
    }

    public static void main(String[] args) {

        int arr[] = {3, 4, 1, 7, 9};

        System.out.println(solve(arr));
    }
}