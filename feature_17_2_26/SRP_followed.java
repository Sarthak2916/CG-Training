package feature_17_2_26;

import java.util.ArrayList;

public class SRP_followed {

    public static void main(String[] args) {

        Product2 p1= new Product2("Laptop",60000);
        Product2 p2= new Product2("Mouse",600);

        ShoppingCart2 cart= new ShoppingCart2();
        cart.addProduct(p1);
        cart.addProduct(p2);

        ShoppingCartPrinter cartPrinter= new ShoppingCartPrinter(cart);
        cartPrinter.printInvoice();

        ShoppingCartStorage cartStorage= new ShoppingCartStorage(cart);
        cartStorage.saveToDB();

    }
}

class Product2{

    String name;
    int price;

    public Product2(String name, int price){
        this.name=name;
        this.price=price;
    }
}

class ShoppingCart2{

    ArrayList<Product2> products=new ArrayList<>();

    void addProduct(Product2 p){
        products.add(p);
    }

    double calcTotalPrice(){
        double total=0;
        for(Product2 p:products){
            total+=p.price;
        }
        return total;
    }
}

class ShoppingCartPrinter{

    ShoppingCart2 sc;

    public ShoppingCartPrinter(ShoppingCart2 sc){
        this.sc=sc;
    }
    void printInvoice(){
        for(Product2 p: sc.products){
            System.out.println(p.name+" "+p.price);
        }
        System.out.println("total price: "+sc.calcTotalPrice());
    }
}

class ShoppingCartStorage{

    ShoppingCart2 sc;

    public ShoppingCartStorage(ShoppingCart2 sc){
        this.sc=sc;
    }

    void saveToDB(){
        System.out.println("saving to DB...");
    }

}



