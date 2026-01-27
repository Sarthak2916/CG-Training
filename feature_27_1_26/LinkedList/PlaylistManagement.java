package feature_27_1_26.linkedlist;

public class PlaylistManagement {

    public static void main(String[] args) {

        Playlist list= new Playlist();
        list.addSongAtE("abcd","xyz",5);
        list.addSongAtE("mahabharat","mehendra kapoor",2.5);
        list.addSongAtB("Highway to Hell","ACDC",3.5);
        list.nextSong();
        list.nextSong();
        list.nextSong();
        list.nextSong();
//        list.display();

    }
}

class SongNode{

    String name;
    String artist;
    double duration;
    SongNode next;

    public SongNode(String name, String artist, double duration){
        this.name= name;
        this.artist= artist;
        this.duration= duration;
        this.next=this;
    }
}

class Playlist{

    SongNode head;
    SongNode currentSong;

    void addSongAtE(String name, String artist, double duration){

        SongNode newNode= new SongNode(name,artist,duration);

        if(head==null){
            head= newNode;
            return;
        }

        SongNode temp= head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next= newNode;
        temp.next.next=head;
        currentSong=head;
    }
    void addSongAtB(String name, String artist, double duration){

        SongNode newNode= new SongNode(name,artist,duration);

        if(head==null){
            head= newNode;
            return;
        }

        newNode.next=head;
        SongNode temp= head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        head= newNode;
        currentSong= head;
    }
    void nextSong(){
        currentSong=currentSong.next;
        System.out.println("Now Playing: "+currentSong.name);
    }
    void display(){

        SongNode temp= head;
        System.out.println(temp.name+" | "+temp.artist+" | "+temp.duration);
        temp=temp.next;
        while(temp!=head){
            System.out.println(temp.name+" | "+temp.artist+" | "+temp.duration);
            temp=temp.next;
        }
    }

}
