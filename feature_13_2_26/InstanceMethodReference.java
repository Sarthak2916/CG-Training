package feature_13_2_26;

interface Operation {
    void perform(int a, int b);
}

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class InstanceMethodReference {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        Operation op = c::add;

        op.perform(10, 5);
    }
}

