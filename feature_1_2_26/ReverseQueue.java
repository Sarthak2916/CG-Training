package feature_1_2_26;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {

    static void reverse(Queue<Integer> q){

        if(q.isEmpty()) return;

        int front = q.poll();

        reverse(q);

        q.add(front);
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.                          nextInt();

        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<n;i++){
            q.add(input. nextInt());
        }
        reverse(q);
        System.out.println(q);

    }
}
