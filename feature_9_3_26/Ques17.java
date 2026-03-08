package CG_Engineers.M1Practice;

public class Ques17 {

    public static boolean isPalindrome(int num) {

        int rev = 0;
        int temp = num;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev == temp;
    }

    public static void printPalindromes(int a, int b) {

        for (int i = a; i <= b; i++) {

            if (isPalindrome(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        printPalindromes(10, 80);
    }
}