package feature_17_2_26;

import java.util.ArrayList;

public class SRP_violated {

    public static void main(String[] args) {

        Product p1= new Product("Laptop",60000);
        Product p2= new Product("Mouse",600);

        ShoppingCart cart= new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        System.out.println(cart.calcTotalPrice());
        cart.printInvoice();
        cart.saveToDB();

    }
}

class Product{

    String name;
    int price;

    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }
}

class ShoppingCart{

    ArrayList<Product> products=new ArrayList<>();

    void addProduct(Product p){
        products.add(p);
    }

    double calcTotalPrice(){
        double total=0;
        for(Product p:products){
            total+=p.price;
        }
        return total;
    }
    void printInvoice(){
        System.out.println("Printing invoice");
    }
    void saveToDB(){
        System.out.println("saving to DB");
    }

}
