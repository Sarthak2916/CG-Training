package feature_10_2_26;

public class DeprecatedClass {

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // Shows warning
        api.newFeature();   // No warning
    }
}


class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("This is the OLD feature (Deprecated)");
    }

    void newFeature() {
        System.out.println("This is the NEW recommended feature");
    }
}

