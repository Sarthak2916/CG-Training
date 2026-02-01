package feature_1_2_26;

import java.util.HashMap;
import java.util.Map;

public class KeyWithHighestValue {

    public static void main(String[] args) {

        HashMap<Character,Integer> map= new HashMap<>();
        map.put('A',2);
        map.put('B',4);
        map.put('C',1);
        int maxValue=Integer.MIN_VALUE;
        char key=0;
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue()>maxValue){
                maxValue=e.getValue();
                key=e.getKey();
            }
        }
        System.out.println(key);
    }
}
