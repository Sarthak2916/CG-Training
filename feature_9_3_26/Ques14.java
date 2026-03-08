package CG_Engineers.M1Practice;

public class Ques14 {

    public static int calculate(int m, int n) {

        int sum = 0;

        for (int i = m; i <= n; i++) {
            if (i % 15 == 0)
                sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(12, 50));
    }
}