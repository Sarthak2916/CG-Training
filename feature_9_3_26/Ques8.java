package CG_Engineers.M1Practice;

public class Ques8 {

    public static String decToNBase(int n, int num) {

        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";

        while (num > 0) {
            int rem = num % n;
            result = digits.charAt(rem) + result;
            num = num / n;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 12;
        int num = 718;
        System.out.println(decToNBase(n, num));
    }
}
