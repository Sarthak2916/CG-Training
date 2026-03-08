package CG_Engineers.M1Practice;

public class Ques13 {

    public static int maxExponents(int a, int b) {

        int maxExp = -1;
        int result = a;

        for (int i = a; i <= b; i++) {

            int num = i;
            int count = 0;

            while (num % 2 == 0) {
                count++;
                num /= 2;
            }

            if (count > maxExp) {
                maxExp = count;
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxExponents(7, 12));
    }
}