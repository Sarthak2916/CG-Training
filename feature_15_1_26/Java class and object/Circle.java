package feature_15_1_26.java_class_and_object;

public class Circle {

    static double pi=Math.PI;
    private double radius;
    private double area;
    private double circumference;

    Circle(){
        radius=0;
        area=0;
        circumference=0;
    }
    Circle(double radius){
        this.radius=radius;
        area=0;
        circumference=0;
    }
    void calcArea(){
        area=pi*radius*radius;
    }
    void calcCircumference(){
        circumference=2*pi*radius;
    }
    void displayArea(){
        System.out.println(area);
    }
    void displayCircumference(){
        System.out.println(circumference);
    }
}
