package feature_28_1_26.linkedlist;

public class StudentRecordManagement {

    public static void main(String[] args) {

        StudentList list= new StudentList();
        list.addStudentRecordAtE(101,"Geralt",74,'A');
        list.addStudentRecordAtB(102,"Yennefer",60,'A');
        list.searchStudent(102);
        list.updateGrade(101,'C');
        list.deleteStudent(102);
        list.displayStudents();
    }
}

class StudentNode{

    long rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    public StudentNode(long rollNo, String name, int age, char grade){
        this.rollNo= rollNo;
        this.name= name;
        this.age= age;
        this.grade= grade;
        this.next=null;
    }
}

class StudentList{

    StudentNode head;

    void addStudentRecordAtE(long rollNo, String name, int age, char grade){

        StudentNode newNode= new StudentNode(rollNo, name, age, grade);
        if(head==null){
            head= newNode;
            return;
        }

        StudentNode currentNode= head;
        while(currentNode.next!=null) currentNode=currentNode.next;
        currentNode.next= newNode;
    }
    void addStudentRecordAtB(long rollNo, String name, int age, char grade){

        StudentNode newNode= new StudentNode(rollNo, name, age, grade);
        if(head==null){
            head= newNode;
            return;
        }

        newNode.next= head;
        head=newNode;
    }
    void searchStudent(long rollNo){
        if(head==null) return;
        StudentNode temp= head;
        while(temp!=null){
            if(temp.rollNo==rollNo){
                System.out.println(temp.rollNo+" | "+temp.name+" | "+temp.age+" | "+ temp.grade);
            }
            temp=temp.next;
        }
    }
    void updateGrade(long rollNo, char grade){
        if(head==null) return;
        StudentNode temp= head;
        while(temp!=null){
            if(temp.rollNo==rollNo){
                temp.grade=grade;
                return;
            }
            temp=temp.next;
        }
    }
    void deleteStudent(long rollNo){
        if(head==null) return;
        StudentNode curr= head;
        StudentNode prev= null;
        while(curr!=null){
            if(curr.rollNo==rollNo){
                if(curr==head){
                    head=curr.next;
                }
                else prev.next= curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    void displayStudents(){
        if(head==null) return;
        StudentNode currentNode= head;
        while(currentNode!=null){
            System.out.println(currentNode.rollNo+" | "+currentNode.name+" | "+currentNode.age+" | "+ currentNode.grade);
            currentNode=currentNode.next;
        }
    }
}
