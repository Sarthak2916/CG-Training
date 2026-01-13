package feature_13_1_26.gfg_questions;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLeaders {

    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag=false;
                }
            }
            if(flag){
                list.add(arr[i]);
            }
            flag=true;
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }

        ArrayList<Integer> result= leaders(arr);
        System.out.println(result);
    }
}
