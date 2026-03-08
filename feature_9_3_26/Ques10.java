package CG_Engineers.M1Practice;

public class Ques10 {

    public static int numberOfCarries(int num1, int num2) {

        int carry = 0;
        int count = 0;

        while (num1 > 0 || num2 > 0) {

            int d1 = num1 % 10;
            int d2 = num2 % 10;

            int sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfCarries(451, 349));
    }
}