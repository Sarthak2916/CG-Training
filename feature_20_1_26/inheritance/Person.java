package feature_19_1_26.inheritance;

public class Person {

    String name;
    int id;

//    Person(){} // why didn't ask to create non parameterized constructor this time?
    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
}
interface Worker{

    void performDuties();

}
class Chef extends Person implements Worker{

    Chef(String name, int id){
        super(name,id);
    }

    public void performDuties(){
        System.out.println("Cooking dish");
    }
}
class Waiter extends Person implements Worker{

    Waiter(String name, int id){
        super(name,id);
    }

    public void performDuties(){
        System.out.println("Serving dish");
    }

}
