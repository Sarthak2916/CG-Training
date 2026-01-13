package feature_13_1_26.gfg_questions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class LongestName {

    public static String longest(List<String> arr) {
        // code here
        int maxLength= Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).length()>maxLength){
                maxLength=arr.get(i).length();
                index=i;
            }
        }
        return arr.get(index);
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        List<String> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(input.next());
        }
        String result= longest(arr);
        System.out.println(result);
    }
}
