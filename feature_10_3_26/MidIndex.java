package CG_Engineers.M1Test;

import java.util.ArrayList;
import java.util.List;

public class MidIndex {

    public static void main(String[] args) {

        int []arr= {1,-2,3,-4,5,2};

        List<Integer> list= new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0) list.add(arr[i]);
        }

        int index= list.size()%2!=0 ? list.get(list.size()/2) : list.get((list.size()/2)-1);
        System.out.println(index);


    }
}
