package CG_Engineers.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Ques1 {

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(4,2,7));
        int maxOperations =2;

        for(int i=1;i<list.size()-1;i++){
            int min= Integer.MAX_VALUE;
            for(int j=i+1;j<list.size();j++){
                min=Math.min(min,Math.abs(list.get(i)-list.get(j)));
            }
            list.add(min);
            if(maxOperations--==0 || min==0) break;

        }

        int min= Integer.MAX_VALUE;

        for(int i=0;i<list.size();i++){
            min= Math.min(min,list.get(i));
        }

        System.out.println(min);
    }
}
