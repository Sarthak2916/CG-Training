package CG_Engineers.DSA;

public class Ques22 {

    public static void main(String[] args) {

        int []employeeSkills= {1,5,9,9,10};
        int []teamSize= {1,1,3};
        int total=0;
        int left=0;
        int right=employeeSkills.length-1;

        for(int i=0;i<teamSize.length;i++){
            int size= teamSize[i];
            if(size==1){
                total+=2*employeeSkills[right];
            } else{
                int min= employeeSkills[left];
                int max= employeeSkills[right];
                total+=min+max;
                left+=size-1;
            }
            right--;
        }
        System.out.println(total);
    }
}
