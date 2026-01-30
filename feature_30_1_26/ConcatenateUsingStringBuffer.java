package feature_30_1_26;

import java.util.Scanner;

public class ConcatenateUsingStringBuffer {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n=input.nextInt();
        String arr[]= new String[n];

        for(int i=0;i<n;i++){
            arr[i]= input.next();
        }

        StringBuffer sb= new StringBuffer();

        for(int i=0;i<n;i++){
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());

    }
}
