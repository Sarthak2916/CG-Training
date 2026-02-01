package feature_1_2_26;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseList {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.                          nextInt();

        LinkedList<Integer> list= new LinkedList<>();

        for(int i=0;i<n;i++){
            list.add(input. nextInt());
        }
        int i=0,j=list.size()-1;
        while(i<j){
            int t=list.get(i);
            list.set(i,list.get(j));
            list.set(j,t);
            i++;
            j--;
        }
        System.out.println(list);

    }
}
