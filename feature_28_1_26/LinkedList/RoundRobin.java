package feature_28_1_26.linkedlist;

public class RoundRobin {

    public static void main(String[] args) {

        RoundRobinList list= new RoundRobinList();
        list.addProcess(101,5,100);
        list.addProcess(102,6,70);
//        list.removeProcess(101);
        list.simulateRoundRobinAlgo(2);
        list.displayProcesses();
    }
}

class ProcessNode{

    int id;
    double burstTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int id, double burstTime, int priority){
        this.id= id;
        this.burstTime= burstTime;
        this.priority=priority;
        this.next= this;
    }
}

class RoundRobinList{

    ProcessNode head;

    void addProcess(int id, double burstTime, int priority){

        ProcessNode newNode= new ProcessNode(id,burstTime,priority);
        if(head==null){
            head=newNode;
            return;
        }
        ProcessNode temp= head;
        while(temp.next!=head) temp=temp.next;
        temp.next=newNode;
        newNode.next=head;
    }
    void simulateRoundRobinAlgo(int timeQuantum){

        if(head==null) return;

        ProcessNode curr= head;

        while(head!=null){

            double executionTime= Math.min(curr.burstTime,timeQuantum);
            curr.burstTime-=executionTime;

            System.out.println("Process "+curr.id+" executed for "+executionTime+" units");

            ProcessNode nextProcess= curr.next;

            if(curr.burstTime==0) removeProcess(curr.id);

            curr=(head==null)?null:nextProcess;
        }
        System.out.println("All Processes executed");



    }
    void removeProcess(int id){

        if(head==null) return;
        ProcessNode curr= head;
        ProcessNode prev=null;

        if(curr.next==head && curr.id==id){
            head=null;
            return;
        }

        do{
            if(curr.id==id){
                if(curr==head){
                    ProcessNode temp= head;
                    while(temp.next!=head) temp=temp.next;
                    head=curr.next;
                    temp.next=head;
                }
                else prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }while(curr!=head);

    }
    void displayProcesses(){

        if(head==null) return;
        ProcessNode temp= head;
        do {
            System.out.println(temp.id+" | "+temp.burstTime+" | "+temp.priority);
            temp=temp.next;
        }while(temp!=head);
    }
}
