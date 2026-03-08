package CG_Engineers.M1Practice;

public class Ques16 {

    public static void printTable(int n) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            int val = n * i;

            System.out.print(val + " ");

            sum += val;
        }

        System.out.println();
        System.out.println(sum);
    }

    public static void main(String[] args) {

        printTable(5);
    }
}