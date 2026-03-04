package CG_Engineers.DSA;

import java.util.Arrays;

public class Ques16 {

    public static void main(String[] args) {

        int []arr= {1,0,1,2,1,3};
        boolean prevIncrement=false;

        int total=0;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                if(prevIncrement){
                    System.out.println("not gonnna happen");
                    return;
                }
                int inc= arr[i]-arr[i+1];
                arr[i+1]+=inc;
                total+=inc;
                prevIncrement=true;
            } else {
                prevIncrement=false;
            }

        }

        String a="ytu";
        System.out.println(a.contains("ytu"));
        System.out.println(Arrays.toString(arr));
        System.out.println(total);
    }
}
