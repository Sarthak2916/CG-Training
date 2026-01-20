package feature_19_1_26.inheritance;

public class Author extends Book{

    String name;
    String bio;

    public Author(String name, String bio){
        this.name=name;
        this.bio=bio;
    }

    void displayInfo(String title, int year){
        Book book = new Book(title,year);
        System.out.println("Book Details: ");
        System.out.println("title: "+book.title+"\npublication year: "+book.publicationYear);
        System.out.println("Author Details: ");
        System.out.println("name: "+name+"\nbio: "+bio);
    }
}
