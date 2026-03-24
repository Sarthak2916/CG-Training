package org.example;

public class Student {

    int id;
    String name;
    String course;

    Student(int id, String name, String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }

    int getId(){
        return id;
    }
    String getName() {return name;}
    String getCourse(){ return course;}

    void setId(int id){ this.id=id;}
    void setName(String name){ this.name= name;}
    void setCourse(String course){ this.course= course;}

    public String toString(){
        return getId()+" "+getName()+" "+getCourse();
    }
}
