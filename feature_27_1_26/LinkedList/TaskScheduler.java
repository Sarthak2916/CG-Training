package feature_27_1_26.linkedlist;

public class TaskScheduler {

    public static void main(String[] args) {

        TaskList list= new TaskList();
        list.addTaskAtE(1,"prepare for test",100, 20260128);
        list.addTaskAtB(2,"watch Youtube",20, 20260127);
        list.addTaskAtE(3, "Study LinkedList",60, 20260128);
        list.removeTask(2);
        list.display();
    }
}

class TaskNode{

    int id;
    String name;
    int priority;
    int dueDate;
    TaskNode next;

    public TaskNode(int id, String name, int priority, int dueDate){
        this.id=id;
        this.name= name;
        this.priority= priority;
        this.dueDate= dueDate;
        this.next= this;
    }
}

class TaskList{

    TaskNode head;

    void addTaskAtE(int id, String name, int priority, int dueDate){
        TaskNode newNode= new TaskNode(id,name,priority,dueDate);
        if(head==null){
            head=newNode;
            return;
        }
        TaskNode currentNode= head;
        while(currentNode.next!=head) currentNode=currentNode.next;
        newNode.next= head;
        currentNode.next=newNode;
    }
    void addTaskAtB(int id, String name, int priority, int dueDate){
        TaskNode newNode= new TaskNode(id,name,priority,dueDate);
        if(head==null){
            head=newNode;
            return;
        }

        TaskNode currentNode= head;
        while(currentNode.next!=head) currentNode=currentNode.next;
        newNode.next= head;
        head= newNode;
        currentNode.next= newNode;
    }

    void removeTask(int id){
        if(head==null) return;
        TaskNode previousNode= null;
        TaskNode currentNode= head;

        do{
            if(currentNode.id==id){
                if(currentNode==head){
                    TaskNode temp= head;
                    while(temp.next!=head) temp=temp.next;
                    head=currentNode.next;
                    temp.next=head;
                }
                else previousNode.next=currentNode.next;
                return;
            }
            previousNode= currentNode;
            currentNode= currentNode.next;
        }
        while(currentNode!=head);
    }
    void display() {
        if(head==null) return;
        TaskNode currentNode = head;
        System.out.println(currentNode.id + " | " + currentNode.name + " | " + currentNode.priority + " | " + currentNode.dueDate);
        currentNode = currentNode.next;
        while (currentNode!= head) {
            System.out.println(currentNode.id + " | " + currentNode.name + " | " + currentNode.priority + " | " + currentNode.dueDate);
            currentNode = currentNode.next;
        }
    }
}
