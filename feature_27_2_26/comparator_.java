package Compare;

import java.util.*;

public class comparator_ {
    public static void main(String[] args) {

        List<Integer> p= Arrays.asList(6,2,8,1,7,9,4);

//        p.sort((x1,x2)-> x1%2 - x2%2);
        p.sort((x1,x2)-> x1 - x2);
        System.out.println(p);
    }
}
