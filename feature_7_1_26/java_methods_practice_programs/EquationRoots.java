package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class EquationRoots {
    static double findDelta(int a, int b, int c){
        double result= b*b + 4*a*c;
        return result;
    }
    static double[] findRoots(int a, int b, int c){
        double result[];
        double delta=findDelta(a,b,c);
        if(delta>0){
            result=new double[2];
            result[0]=(-b+Math.sqrt(delta))/(2*a);
            result[1]=(-b-Math.sqrt(delta))/(2*a);
            return result;
        }
        else if(delta==0){
            result=new double[1];
            result[0]=-b/(2*a);
            return result;
        }
        return new double[]{};
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double[]result=findRoots(a,b,c);
        System.out.print("roots of equation "+a+"x^2 + "+b+"x + "+c+" are ");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }

    }
}
