package feature_30_1_26;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateUsingStringBuilder {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String str= input.next();

        StringBuilder sb= new StringBuilder();

        HashSet<Character> set= new HashSet<>();

        for(char c: str.toCharArray()){
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println(sb.toString());
    }
}
