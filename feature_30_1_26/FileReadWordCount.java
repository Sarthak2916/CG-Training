package feature_30_1_26;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadWordCount {

    public static void main(String[] args) {

        try {

            String word="hello";
            String filePath = "src/feature_30_1_26/file.txt";

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            int count=0;
            while ((line=br.readLine()) != null) {
                for(String s: line.split(" ")){
                    if(s.equals(word)) count++;
                }
            }

            System.out.println("Count of Word "+word+" is: "+count);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
