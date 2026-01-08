package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class IndexOutOfBoundException {

    static void generateException(String str) {
        System.out.println("Character at invalid index: " + str.charAt(str.length()));
    }

    static void handleException(String str) {
        try {
            System.out.println("Character at invalid index: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str= input.next();
//        generateException(str);

        handleException(str);
    }
}

