package feature_15_1_26.java_class_and_object;

public class Book {

    private String title;
    private String author;
    private int price;

    Book(){
        title="";
        author="";
        price=0;
    }
    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void displayDetails(){
        System.out.println("Book title: "+title
        +"\nBook author: "+author
        +"\nBook price: "+price);

    }
}
