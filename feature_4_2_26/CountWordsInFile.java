package feature_4_2_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordsInFile {

    public static void main(String[] args) {

        try{

            BufferedReader br= new BufferedReader(new FileReader("src/feature_4_2_26/output.txt"));
            HashMap<String,Integer> map= new HashMap<>();

            String line;
            int count=0;
            while((line=br.readLine())!=null){
                for(String s: line.split(" ")){
                    map.put(s,map.getOrDefault(s,0)+1);
                    count++;
                }
            }

            ArrayList<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
            LinkedHashMap<String,Integer> orderedMap= new LinkedHashMap<>();

            for(Map.Entry<String,Integer> e: list){
                orderedMap.put(e.getKey(),e.getValue());
            }
            int i=5;
            for(String key: orderedMap.keySet()){
                if(i<=0) break;
                System.out.println(key);
                i--;
            }

            System.out.println("total no. of words: "+count);

        } catch (IOException e){

            e.printStackTrace();
        }
    }
}
