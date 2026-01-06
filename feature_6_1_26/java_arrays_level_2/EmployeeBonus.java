package feature_6_1_26.java_arrays_level_2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        //input
        Scanner input= new Scanner(System.in);
        double[] oldSalary= new double[10];
        double[] year= new double[10];
        double[] newSalary= new double[10];
        double[] bonus= new double[10];
        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;
        int i=0;
        //taking input of salary and year
        while(i<oldSalary.length){
            double tempSalary=input.nextDouble();
            double tempYear= input.nextDouble();
            if(tempSalary<=0 || tempYear<0){
                System.out.println("Invalid numbers. Enter again");
                continue;
            }
            oldSalary[i]= tempSalary;
            year[i]= tempYear;
            i++;
        }
        //calculating bonus, new salary, total bonus, total old salary, total new salary
        for(int j=0;j<oldSalary.length;j++){
            if(year[j]>5) bonus[j]= oldSalary[j]*5/100;
            else bonus[j]= oldSalary[j]*2/100;
            newSalary[j]= bonus[j]+oldSalary[j];
            totalBonus+=bonus[j];
            totalNewSalary+=newSalary[j];
            totalOldSalary+=oldSalary[j];
        }
        //printing total bonus, total old salary, total new salary
        System.out.println("total bonus: "+totalBonus+"\ntotal old salary: "+totalOldSalary+
                "\ntotal new salary "+totalNewSalary);
    }
}
