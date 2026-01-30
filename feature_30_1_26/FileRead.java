package feature_30_1_26;

import java.io.FileReader;
import java.io.BufferedReader;

public class FileRead {

    public static void main(String[] args) {

        try {

            String filePath = "src/feature_30_1_26/file.txt";

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
