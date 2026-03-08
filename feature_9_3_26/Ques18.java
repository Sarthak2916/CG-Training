package CG_Engineers.M1Practice;

public class Ques18 {

    public static double distance(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        double d1 = distance(1, 1, 2, 4);
        double d2 = distance(2, 4, 3, 6);
        double d3 = distance(1, 1, 3, 6);

        double sum = d1 + d2 + d3;

        System.out.println(sum);
    }
}