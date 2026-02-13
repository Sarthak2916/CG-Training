package feature_13_2_26;

interface Operation2 {
    void perform(int a, int b);
}

class MathUtils {
    static void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }
}

public class StaticMethodReference {

    public static void main(String[] args) {

        Operation2 op = MathUtils::subtract;

        op.perform(15, 3);
    }
}

