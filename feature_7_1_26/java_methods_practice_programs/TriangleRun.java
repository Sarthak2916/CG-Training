package feature_7_1_26.java_methods_practice_programs;
import java.util.Scanner;
public class TriangleRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return totalDistance / perimeter;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = TriangleRun.calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds required to complete 5 km: " + rounds);
    }
}
