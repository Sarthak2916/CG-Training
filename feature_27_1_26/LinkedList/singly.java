package feature_27_1_26.linkedlist;

public class singly {

    public static void main(String[] args) {

        Node n1= new Node(5);
        Node n2= new Node(10);
        n1.next=n2;
        Node temp=n1;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
class Node{

    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
