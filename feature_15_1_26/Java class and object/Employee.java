package feature_15_1_26.java_class_and_object;

public class Employee {

    private String name;
    private int id;
    private int salary;

    Employee(String name, int id, int salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void viewDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
}
