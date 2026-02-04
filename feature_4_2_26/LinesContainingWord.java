package feature_4_2_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinesContainingWord {

    public static void main(String[] args) {

        try{

            BufferedReader br= new BufferedReader(new FileReader("src/feature_4_2_26/output.txt"));

            String line;

            while((line=br.readLine())!=null){
                for(String s: line.split(" ")){
                    if(s.toLowerCase().equals("error")){
                        System.out.println(line);
                        break;
                    }
                }
            }
            br.close();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
