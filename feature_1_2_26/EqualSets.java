package feature_1_2_26;

import java.util.HashSet;

public class EqualSets {

    public static void main(String[] args) {

        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);set2.add(0);

        System.out.println(set1.equals(set2));

    }
}
