package feature_6_1_26.java_arrays_level_1;
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int []arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        //calculating whether number is positive, negative or zero. If positive then even or odd
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.print("positive and ");
                if(arr[i]%2==0) System.out.println("even");
                else System.out.println("odd");
            }
            else if(arr[i]<0) System.out.println("negative");
            else System.out.println("zero");
        }
        //checking if numbers are equal, greater or less than
        if(arr[0]==arr[arr.length-1]) System.out.println("Both are equal");
        else if(arr[0]>arr[arr.length-1]) System.out.println("First element is greater than last element");
        else System.out.println("First element is less than last element");
    }
}
