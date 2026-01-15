package feature_15_1_26.java_class_and_object;

public class Student {

    private String name;
    private int rollNo;
    private int marks;
    private char grade;

    Student(){
        name="";
        rollNo=0;
        marks=0;
        grade='-';
    }
    Student(String name, int rollNo, int marks){
        this.name= name;
        this.rollNo= rollNo;
        this.marks= marks;
    }

    void calcGrade(){
        if(marks>=80) grade='A';
        else if(marks>=70) grade='B';
        else if(marks>=60) grade='C';
        else if(marks>=50) grade='D';
        else if(marks>=40) grade='E';
        else grade='F';

    }
    void displayDetails(){
        System.out.println("Student's name: "+name
        +"\nStudent's rollNo: "+rollNo
        +"\nStudent's Marks: "+marks
        +"\nStudent's Grade: "+grade);
    }

}
