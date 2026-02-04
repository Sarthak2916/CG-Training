package feature_4_2_26;

import java.io.*;

public class ObjectSerialization {

    public static void main(String[] args) {

        Employee e1= new Employee(3,"Sarthak",100000);
        Employee e2= new Employee(1, "Papu",1000);

        try{

            ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("src/feature_4_2_26/employee.dat"));
            oos.writeObject(e1);
            oos.writeObject(e2);

            ObjectInputStream ois= new ObjectInputStream(new FileInputStream("src/feature_4_2_26/employee.dat"));

            Employee e;
            while(true){
                e=(Employee) ois.readObject();
                System.out.println(e);
            }


        } catch(EOFException e){
            System.out.println("All objects are read");
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable{

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name= name;
        this.salary= salary;
    }
    public String toString(){
        return id+" "+name+" "+salary;
    }
}
