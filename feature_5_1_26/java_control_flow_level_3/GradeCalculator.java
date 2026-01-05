package feature_5_1_26.java_control_flow_level_3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int pMarks= input.nextInt();
        int cMarks= input.nextInt();
        int mMarks= input.nextInt();
        int average= (pMarks+cMarks+mMarks)/3;
        if(average>=80) System.out.println(average+" A Level 4, above agency-normalized standards");
        else if(average>=70) System.out.println(average+" B Level 3, at agency-normalized standards");
        else if(average>=60) System.out.println(average+" C Level 2, below, but approaching agency-normalized standards");
        else if(average>=50) System.out.println(average+" D Level 1, well below agency-normalized standards");
        else if(average>=40) System.out.println(average+" E Level 1-, too below agency-normalized standards");
        else System.out.println(average+" R Remedial standards");

    }
}
