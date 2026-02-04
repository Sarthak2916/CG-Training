package feature_5_2_26;

import java.util.ArrayList;

public class SmartWarehouseManagementSystem {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage= new Storage<>();
        electronicsStorage.addItem(new Electronics("Induction",5000));
        electronicsStorage.addItem(new Electronics("Kettle",1000));
        Storage<Groceries> groceriesStorage= new Storage<>();
        groceriesStorage.addItem(new Groceries("aloo baigan",100));

        electronicsStorage.displayItems(electronicsStorage.items);
        groceriesStorage.displayItems(groceriesStorage.items);

    }
}

abstract class WarehouseItem{

    String itemName;
    double price;

    public WarehouseItem(String itemName, double price){
        this.itemName= itemName;
        this.price= price;
    }
    abstract String getDetails();
}
class Electronics extends WarehouseItem{

    Electronics(String itemName, double price){
        super(itemName,price);
    }
    String getDetails(){
        return itemName+" "+price;
    }
}
class Groceries extends WarehouseItem{

    Groceries(String itemName, double price){
        super(itemName,price);
    }
    String getDetails(){
        return itemName+" "+price;
    }
}
class Furniture extends WarehouseItem{

    Furniture(String itemName, double price){
        super(itemName,price);
    }
    String getDetails(){
        return itemName+" "+price;
    }

}
class Storage<T extends WarehouseItem>{

    ArrayList<T> items= new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    void displayItems(ArrayList<? extends WarehouseItem> list){

        for(WarehouseItem item: list){
            System.out.println(item.getDetails());
        }

    }
}
