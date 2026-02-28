package Compare;

import java.util.*;

public class _Comparable {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(Arrays.asList(3,2,1,4,5,6));
        Collections.sort(list,(s1,s2)->s2-s1);
        System.out.println(list);

        List<Student> students= new ArrayList<>();
        students.add(new Student(5));
        students.add(new Student(50));students.add(new Student(2));students.add(new Student(1));

        Collections.sort(students,(s1,s2)->s2.rollno-s1.rollno);
        for(Student s: students){
            System.out.println(s.rollno);
        }



    }
}

class Student implements Comparable<Student>{

    int rollno;

    Student(int rollno){
        this.rollno= rollno;
    }

    public int compareTo(Student s){
        return this.rollno-s.rollno;
    }


}
