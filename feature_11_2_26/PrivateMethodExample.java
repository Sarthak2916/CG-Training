package feature_10_2_26;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodExample {

    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        Method method =
                Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        int result = (int) method.invoke(calc, 4, 5);

        System.out.println("Result: " + result);
    }
}

