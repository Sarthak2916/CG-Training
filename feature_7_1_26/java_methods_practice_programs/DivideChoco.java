package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class DivideChoco {
    static int[] DivideChoco(int chocoNum, int children){
        int remaining= chocoNum%children;
        int chocoPerChild= (chocoNum-remaining)/children;
        return new int[]{remaining,chocoPerChild};
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int chocoNum = input.nextInt();
        int children = input.nextInt();
        int result[]= DivideChoco(chocoNum, children);
        System.out.println("Out of "+chocoNum+", each child gets "+result[1]+" and remaining are "+result[0]);
    }
}
