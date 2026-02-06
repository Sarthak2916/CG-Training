package feature_6_2_26;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {

        try{

            FileReader fr= new FileReader("data.txt");

            int charac;
            while((charac=fr.read())!=-1){
                System.out.print((char) charac);
            }

        } catch (IOException e){
            System.out.println("File not Found");
        }
    }
}
