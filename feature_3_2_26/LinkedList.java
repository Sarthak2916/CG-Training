package feature_3_2_26;

class Node{

    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{

    Node head;

    void addAtE(int data){

        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node currentNode= head;
        while(currentNode.next!=null) currentNode=currentNode.next;
        currentNode.next= newNode;
    }
    void addAtB(int data){

        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head=newNode;
    }
}

