package feature_15_1_26.java_class_and_object;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        ArrayList<String> list= new ArrayList<>();
        System.out.println("which classes you want to run?");
        String s="";
        while(!"//".equals(s)){
            s= input.next();
            list.add(s);
        }

        if(list.contains("CartItem")){
            CartItem cart= new CartItem();
            cart.addItem("chocolate icecream",180,1);
            cart.totalCost();
            cart.removeItem("chocolate icecream");
            cart.totalCost();
        }
        if(list.contains("MovieTicket")){
            MovieTicket ticket= new MovieTicket("Demon Slayer");
            ticket.bookTicket(2,200);
            ticket.bookTicket(4,600);
            ticket.displayTicketDetails();
        }
        if(list.contains("Book")){
            Book book= new Book("The Last Wish", "Andrzej sapkowski",350);
            book.displayDetails();
        }
    }
}
