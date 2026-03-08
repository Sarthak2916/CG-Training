package CG_Engineers.M1Practice;

public class Ques12 {

    public static int operationChoices(int c, int a, int b) {

        switch (c) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(operationChoices(2, 16, 20));
    }
}