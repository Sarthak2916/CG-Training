package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class CanVoteOnRandomAge {
    static String[][] voteValidator(int[] age){
        String[][] result=new String[age.length][2];
        for(int i=0;i< age.length;i++){
            result[i][0]=age[i]+"";
            if(age[i]>=18) result[i][1]="can vote";
            else if(age[i]>0) result[i][1]="can't vote";
            else result[i][1]="invalid age";
        }
        return result;
    }

    static int[] randomArrGenerator(){
        int[]arr= new int[10];
        for(int i=0;i<arr.length;i++){
            int val= (int)(Math.random()*100);
            arr[i]=val;
        }
        return arr;
    }
    static void displayResult(String[][] result){
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] randomAge= randomArrGenerator();
        String[][] result=voteValidator(randomAge);
        displayResult(result);
    }
}
