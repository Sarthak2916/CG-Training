package CG_Engineers.ObjectModeling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {

    }
}

class Product{
    String name;
    double price;
    int qty;
    Product(int qty, String name, double price){
        this.qty=qty;
        this.name=name;
        this.price=price;
    }
}

interface ListInterface{

    void add(Product p);
    void remove(Product p);
    void search(Product p);
    void showAll();
}
class ProductList implements ListInterface{

    List<Product> products;
    ProductList(){
        products= new ArrayList<>();
    }
    public void add(Product p){
        if(products.isEmpty()){
            products.add(p);
            return;
        }
        for(Product P: products){
            if(P.name.equals(p.name)){
                Scanner sc= new Scanner(System.in);
            }
        }
    }
    public void remove(Product p){

    }
    public void search(Product p){
        for(Product P: products){
            if(P.name.equals(p.name)){
                System.out.println(p.name);
            }
        }
    }
    public void showAll(){
        for(Product p: products){
            System.out.println(p.name+" "+p.price+" "+p.qty);
        }
    }
}