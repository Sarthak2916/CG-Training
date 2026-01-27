package feature_27_1_26.linkedlist;

public class EmployeeRecordManagement {

    public static void main(String[] args) {

        EmployeeLinkedList list= new EmployeeLinkedList();
        list.addEmployee(101,"Bruce Wayne", "Justice", 10000000);
        list.addEmployee(102, "Clark Kent", "Media", 100000);
        list.display();
    }
}

class EmployeeNode{

    int id;
    String name;
    String department;
    int salary;
    EmployeeNode next;

    public EmployeeNode(int id, String name, String department, int salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary= salary;
        this.next=null;
    }
}

class EmployeeLinkedList{

    EmployeeNode head;

    void addEmployee(int id, String name, String department, int salary){

        EmployeeNode newNode= new EmployeeNode(id,name,department,salary);

        if(head==null){
            head=newNode;
            return;
        }

        EmployeeNode temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
    }

    void display(){

        EmployeeNode temp= head;
        while(temp!=null){
            System.out.println(temp.id+" | "+temp.name+" | "+temp.department+" | "+temp.salary);
            temp=temp.next;
        }
    }


}
