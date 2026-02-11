package feature_10_2_26;

import java.util.ArrayList;

public class SuppressWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Raw ArrayList (without generics)
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add(100);   // Mixing different data types

        // Type casting (normally produces unchecked warning)
        String language = (String) list.get(0);

        System.out.println(language);
    }
}

