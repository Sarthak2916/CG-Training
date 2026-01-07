package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class WindChillTemp {
    static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double temperature=input.nextDouble();
        double windSpeed=input.nextDouble();
        double windChill= calculateWindChill(temperature,windSpeed);
        System.out.println("Wind Chill Temperature is: "+windChill);
    }
}
