package feature_4_2_26;

import java.io.*;

public class ReadWriteFile {

    public static void main(String[] args) {

        try{

        FileReader fr= new FileReader("src/feature_4_2_26/source.txt");
        BufferedReader br= new BufferedReader(fr);
        BufferedWriter bw= new BufferedWriter(new FileWriter("src/feature_4_2_26/output.txt",true));

        String line;

        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
        br= new BufferedReader(new FileReader("src/feature_4_2_26/output.txt"));
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
