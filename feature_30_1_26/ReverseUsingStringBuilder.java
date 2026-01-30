package feature_30_1_26;

import java.util.Scanner;

public class ReverseUsingStringBuilder {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String str= input.next();

        StringBuilder sb= new StringBuilder();
        sb.append(str);
        sb.reverse();

        str=sb.toString();

        System.out.println(str);
    }
}
