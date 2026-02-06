package feature_6_2_26;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try{

            Scanner sc= new Scanner(System.in);
//            int []arr= null;
            int[]arr= {1,2,3,4};
            int i= sc.nextInt();
            System.out.println(arr[i]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }


    }
}
