package feature_15_1_26.java_class_and_object;

public class Item {

    private int itemCode;
    private String itemName;
    private int price;

    Item(){
        itemCode=0;
        itemName="";
        price=0;
    }
    Item(int itemCode, String itemName, int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    void displayItemDetails(){
        System.out.println("Item Code: "+itemCode+"\nItemName: "+itemName+"\nItem Price: "+price);
    }
    int totalCost(int quantity){
        return quantity*price;
    }
}
