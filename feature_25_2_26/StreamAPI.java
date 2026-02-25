import java.util.ArrayList;
import java.util.Arrays;

public class StreamAPI {

    public static void main(String[] args) {

        ArrayList<Integer> x= new ArrayList<>(Arrays.asList(110,22,3,42,5,55,64,7,80,9,10));
        x.stream().filter(y->y%2==0).filter(y->y>10).sorted().forEach(y-> System.out.println(y));

        int a[]= {1,2,3,4,5,6,7,8,9,10};
        int sum= Arrays.stream(a).sum();
        System.out.println(sum);

        int max=Arrays.stream(a).max().getAsInt();// max returns optional not direct value.
        System.out.println(max);

        double avg= Arrays.stream(a).average().getAsDouble();
        System.out.println(avg);

        double _avg= x.stream().mapToInt(y->y).average().getAsDouble();
        System.out.println(_avg);

        x.stream().map(y->""+y).filter(z->z.charAt(0)=='5').forEach(y->System.out.println(y));

        String ar[]= {"Yennefer","Triss","Cirella","Geralt","Ciirella","anna"};

        Arrays.stream(ar).filter(y->y.charAt(0)=='a' && y.charAt(y.length()-1)=='a').sorted().forEach(y-> System.out.println(y));

        Student st[]= {
                new Student(150,75,"Anita"),
                new Student(170,60,"Anita"),
                new Student(150,40,"Anita")
        };

        System.out.println(
                Arrays.stream(st).mapToInt(y-> y.getMarks()).average().getAsDouble()
        );


    }
}

class Student{

    int marks;
    int rollno;
    String name;

    Student(int x, int y, String z){
        marks=x;rollno=y;name=z;
    }
    int getMarks(){
        return marks;
    }
    int getRollno(){
        return rollno;
    }
    String getName(){
        return name;
    }
}
