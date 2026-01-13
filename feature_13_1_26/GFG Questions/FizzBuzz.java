package feature_13_1_26.gfg_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {

    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> list= new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0) list.add("FizzBuzz");
            else if(i%3==0) list.add("Fizz");
            else if(i%5==0) list.add("Buzz");
            else list.add(String.valueOf(i));
        }
        return list;
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n= input.nextInt();
        ArrayList<String> list= fizzBuzz(n);
        System.out.println(list);
    }
}
