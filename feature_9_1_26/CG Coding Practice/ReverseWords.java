package feature_9_1_26;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        for(String word: str.split(" ")){
            for(int i=word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
