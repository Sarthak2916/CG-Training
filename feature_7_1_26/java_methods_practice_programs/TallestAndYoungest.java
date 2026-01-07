package feature_7_1_26.java_methods_practice_programs;

import java.util.Scanner;

public class TallestAndYoungest {
    public static String tallest(int[] height){
        int maxHeight=Integer.MIN_VALUE, maxHeightIndex=-1;
        for(int i=0;i<height.length;i++){
            if(height[i]>maxHeight){
                maxHeight= height[i];
                maxHeightIndex=i;
            }
        }
        String tallest;
        if(maxHeightIndex==0) tallest="Amar";
        else if(maxHeightIndex==1) tallest="Akbar";
        else tallest="Anthony";
        return tallest;
    }
    public static String youngest(int[] age){
        int minAge=Integer.MAX_VALUE,minAgeIndex=-1;
        for(int i=0;i<age.length;i++){
            if(age[i]<minAge){
                minAge= age[i];
                minAgeIndex=i;
            }
        }
        String youngest;
        if(minAgeIndex==0) youngest="Amar";
        else if(minAgeIndex==1) youngest="Akbar";
        else youngest="Anthony";
        return youngest;
    }
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int age[]= new int[3];
        int height[]= new int[3];
        String youngest;
        String tallest;
        for(int i=0;i<age.length;i++){
            age[i]= input.nextInt();
            height[i]= input.nextInt();
        }
        youngest= youngest(age);
        tallest= tallest(height);
        System.out.println(youngest+" is the youngest");
        System.out.println(tallest+" is the tallest");
    }
}
