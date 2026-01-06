package feature_6_1_26.java_arrays_level_2;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        int age[]= new int[3];
        int height[]= new int[3];
        String youngest;
        String tallest;
        for(int i=0;i<age.length;i++){
            age[i]= input.nextInt();
            height[i]= input.nextInt();
        }
        int maxHeight=Integer.MIN_VALUE, minAge=Integer.MAX_VALUE, maxHeightIndex=-1, minAgeIndex=-1;
        //calculating maxHeight, maxHeightIndex, minAge, minAgeIndex
        for(int i=0;i<age.length;i++){
            if(age[i]<minAge){
                minAge= age[i];
                minAgeIndex=i;
            }
            if(height[i]>maxHeight){
                maxHeight= height[i];
                maxHeightIndex=i;
            }
        }
        //printing tallest and youngest
        if(maxHeightIndex==0) System.out.println("Amar is the tallest");
        if(maxHeightIndex==1) System.out.println("Akbar is the tallest");
        if(maxHeightIndex==2) System.out.println("Anthony is the tallest");
        if(minAgeIndex==0) System.out.println("Amar is the youngest");
        if(minAgeIndex==1) System.out.println("Akbar is the youngest");
        if(minAgeIndex==2) System.out.println("Anthony is the youngest");
    }
}
