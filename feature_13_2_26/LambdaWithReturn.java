package feature_13_2_26;

interface Multiply {
    int multiply(int a, int b);
}

public class LambdaWithReturn {

    public static void main(String[] args) {

        Multiply m = (a, b) -> a * b;

        int result = m.multiply(5, 4);

        System.out.println("Result: " + result);
    }
}

