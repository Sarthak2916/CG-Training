package feature_1_2_26;

import java.util.HashMap;
import java.util.Scanner;

public class ElementFrequency {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.                          nextInt();
        String []arr= new String[n];

        for(int i=0;i<n;i++){
            arr[i]=input.next();
        }

        HashMap<String, Integer> map= new HashMap<>();

        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

    }
}
