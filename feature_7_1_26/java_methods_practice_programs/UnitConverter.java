package feature_7_1_26.java_methods_practice_programs;

public class UnitConverter {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
class Main {
    public static void main(String[] args) {

        System.out.println(UnitConverter.convertKmToMiles(10));   // 6.21371
        System.out.println(UnitConverter.convertMilesToKm(5));    // 8.0467
        System.out.println(UnitConverter.convertMetersToFeet(2)); // 6.56168
        System.out.println(UnitConverter.convertFeetToMeters(10));// 3.048
    }
}

