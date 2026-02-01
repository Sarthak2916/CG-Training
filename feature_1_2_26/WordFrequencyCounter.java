package feature_1_2_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        try{
            String filePath= "src/feature_1_2_26/file.txt";
            FileReader fr= new FileReader(filePath);
            BufferedReader br= new BufferedReader(fr);
            HashMap<String,Integer> map= new HashMap<>();
            String line;
            while((line=br.readLine())!=null){
                line=line.toLowerCase();
                map.put(line,map.getOrDefault(line,0)+1);
            }
            System.out.println(map);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
