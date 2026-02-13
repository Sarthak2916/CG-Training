package feature_13_2_26;

interface Greeting {
    void sayHello();
}

public class FunctionalInterface {

    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello from Lambda!");

        g.sayHello();
    }
}

