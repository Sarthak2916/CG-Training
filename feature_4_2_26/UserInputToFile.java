package feature_4_2_26;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {

        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            System.out.println("name: ");
            String name= br.readLine();

            System.out.println("age: ");
            int age= Integer.parseInt(br.readLine());

            System.out.println("fav. programming lang: ");
            String lang= br.readLine();

            FileWriter fw= new FileWriter("src/feature_4_2_26/output.txt",true);

            fw.write(name+"\n");
            fw.write(String.valueOf(age)+"\n");
            fw.write(lang+"\n");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
