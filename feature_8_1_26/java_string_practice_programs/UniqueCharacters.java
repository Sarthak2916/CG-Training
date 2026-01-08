package feature_8_1_26.java_string_practice_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueCharacters {
    static ArrayList<Character> uniqueCharList(String s){
        ArrayList<Character> list= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            for(int j=0;j<s.length();j++){
                if(i==j) continue;
                if(s.charAt(i)==s.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag) list.add(s.charAt(i));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String s= input.nextLine();
        ArrayList<Character> list= uniqueCharList(s);
        System.out.println("Unique Characters in String: "+s+" are\n"+ list);
    }
}
