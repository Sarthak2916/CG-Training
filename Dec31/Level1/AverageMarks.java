package Level1;

public class AverageMarks {
    public static void main(String[] args){
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;
        int averageMarks = (mathsMarks+chemistryMarks+physicsMarks)/totalSubjects;
        System.out.println("Sam's average marks in PCM is: "+averageMarks);
    }
}
