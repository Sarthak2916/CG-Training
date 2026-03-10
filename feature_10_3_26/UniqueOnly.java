package CG_Engineers.M1Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class UniqueOnly {

    public static void main(String[] args) {

        int []arr= {11,11,13,20,11};

        LinkedHashMap<Integer, Integer> map= new LinkedHashMap<>();

        for(int x: arr){
            map.put(x,map.getOrDefault(x,0));
        }

        int []res= new int[map.size()];
        int count=0;
        for(int i: map.keySet()){
            res[count]=i;
            count++;
        }

        System.out.println(Arrays.toString(res));
    }
}
