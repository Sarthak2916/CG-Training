package feature_8_1_26.java_string_practice_programs;

import java.util.Scanner;

public class RockPaperScissors {
    static double[] avgNdPercent(double tWins, double tGames){
        double average= tWins/tGames;
        double percentage= average*100;
        return new double[]{average,percentage};
    }
    static int isWinner(String uInput, String cInput){
        if(uInput.equals(cInput)) return 0;
        if(uInput.equals("rock") && cInput.equals("scissors")) return 1;
        if(uInput.equals("paper") && cInput.equals("rock")) return 1;
        if(uInput.equals("scissors") && cInput.equals("paper")) return 1;
        return -1;
    }
    static String computerChoice(){
        double choice=Math.random();
        if(choice<0.4) return "rock";
        if(choice<0.7) return "paper";
        return "scissors";
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("No. of games: ");
        int count=input.nextInt();
        int totalGames=count;
        int totalWins=0;
        while(count-->0){
            System.out.print("Enter rock, paper or scissors: ");
            String uInput=input.next();
            String cInput=computerChoice();
            System.out.println("Computer Choice: "+cInput);
            if(isWinner(uInput,cInput)==1){
                System.out.println("You Won");
                totalWins++;
            }
            else if(isWinner(uInput,cInput)==-1){
                System.out.println("You Lost");
            }
            else{
                System.out.println("Draw");
            }
        }
        double[]arr= avgNdPercent(totalWins,totalGames);
        System.out.println("average wins: "+arr[0]+"\nwin percentage: "+arr[1]);
    }
}
