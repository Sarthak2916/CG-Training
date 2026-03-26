package com.training.calc;

public class Student {

    String name;
    int age;
    String city;
    String email;

    public Student(String name, int age, String city, String email){
        this.name=name;
        this.age=age;
        this.city=city;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    //    public String toString(){
//        return name+" "+age+" "+city+" "+email;
//    }
}
