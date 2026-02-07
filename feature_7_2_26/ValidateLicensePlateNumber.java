package feature_7_2_26;

public class ValidateLicensePlateNumber {

    public static void main(String[] args) {

        String regex = "^[A-Z]{2}[0-9]{4}$";

        System.out.println("AB1234".matches(regex));
        System.out.println("A12345".matches(regex));
        System.out.println("AA1234".matches(regex));

    }
}
