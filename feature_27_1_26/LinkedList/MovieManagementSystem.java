package feature_27_1_26.linkedlist;

public class MovieManagementSystem {

    public static void main(String[] args) {

        MoviesList list= new MoviesList();
        list.addMovieAtE("Avengers: DoomsDay","Ruso Brothers",2026,9.0);
        list.addMovieAtE("Dune 3","Denis Villeneuve",2026,9.2);
        list.addMovieAtB("Superman","James Gunn",2025,8.3);
//        list.removeMovie("Dune 3");
//        list.removeMovie("Superman");
        list.updateRating("Superman", 9.0);
        list.searchMovie(9.0);
        list.display();
//        list.displayReverse();
    }
}

class MovieNode{

    String title;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode next, prev;

    public MovieNode(String title, String director, int yearOfRelease, double rating){
        this.title= title;
        this.director= director;
        this.yearOfRelease= yearOfRelease;
        this.rating= rating;
        this.next=this.prev=null;

    }
}

class MoviesList{

    MovieNode head;
    MovieNode tail;

    void addMovieAtE(String title, String director, int yearOfRelease, double rating){

        MovieNode newNode= new MovieNode(title,director, yearOfRelease, rating);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next= newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    void addMovieAtB(String title, String director, int yearOfRelease, double rating){

        MovieNode newNode= new MovieNode(title,director, yearOfRelease, rating);

        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }

        newNode.next= head;
        head.prev= newNode;
        head=newNode;
    }
    void removeMovie(String title){

        if(head==null) return;

        MovieNode temp= head;

        while(temp!=null){
            if(temp.title.equals(title)){
                if(head==temp){
                    head=temp.next;
                    if(head!=null){
                        head.prev=null;
                    } else{
                        tail=null;
                    }
                }
                else if(temp==tail){
                    tail= temp.prev;
                    tail.next=null;
                }
                else{
                    temp.next.prev=temp.prev;
                    temp.prev.next=temp.next;
                }
                return;
            }
            temp=temp.next;
        }
    }
    void updateRating(String title, double rating){

        if(head==null) return;

        MovieNode temp= head;

        while(temp!=null){
            if(temp.title.equals(title)){
                temp.rating=rating;
                return;
            }
            temp=temp.next;
        }
    }
    void searchMovie(double rating){

        if(head==null) return;

        MovieNode temp= head;

        while(temp!=null){
            if(temp.rating==rating){
                System.out.println("Title: "+temp.title+" | Director: "+temp.director+" | Year of Release: "+temp.yearOfRelease
                        +" | Rating: "+temp.rating);
            }
            temp=temp.next;
        }
    }
    void searchMovie(String director){

        if(head==null) return;

        MovieNode temp= head;

        while(temp!=null){
            if(temp.director.equals(director)){
                System.out.println("Title: "+temp.title+" | Director: "+temp.director+" | Year of Release: "+temp.yearOfRelease
                        +" | Rating: "+temp.rating);
            }
            temp=temp.next;
        }
    }
    void display(){

        MovieNode temp= head;
        while(temp!=null){
            System.out.println("Title: "+temp.title+" | Director: "+temp.director+" | Year of Release: "+temp.yearOfRelease
                    +" | Rating: "+temp.rating);
            temp=temp.next;
        }
    }
    void displayReverse(){

        MovieNode temp= tail;
        while(temp!=null){
            System.out.println("Title: "+temp.title+" | Director: "+temp.director+" | Year of Release: "+temp.yearOfRelease
                    +" | Rating: "+temp.rating);
            temp=temp.prev;
        }
    }
}

