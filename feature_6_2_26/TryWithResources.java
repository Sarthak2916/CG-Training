package feature_6_2_26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try(
                BufferedReader br= new BufferedReader(new FileReader("src/feature_6_2_26/info.txt"));
                ){

            String line= br.readLine();
            if(line!=null) System.out.println(line);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
