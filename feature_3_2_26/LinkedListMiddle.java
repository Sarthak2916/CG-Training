package feature_3_2_26;

public class LinkedListMiddle {

    static void findMiddleIndexData(Node head){
        if(head==null) return;

        Node slow= head;
        Node fast= head;


        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args) {

        LinkedList list= new LinkedList();

        list.addAtE(1);
        list.addAtE(2);
        list.addAtE(3);
        list.addAtE(4);
        list.addAtE(5);

        findMiddleIndexData(list.head);


    }
}
