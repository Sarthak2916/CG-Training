package feature_4_2_26;

import java.io.*;

public class ConvertToLowerCase {

    public static void main(String[] args) {

        try{

            BufferedReader br= new BufferedReader(new FileReader("src/feature_4_2_26/source.txt"));
            BufferedWriter bw= new BufferedWriter(new FileWriter("src/feature_4_2_26/output.txt",true));

            String line;

            while((line=br.readLine())!=null){
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            br.close();
            bw.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
