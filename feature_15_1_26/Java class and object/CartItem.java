package feature_15_1_26.java_class_and_object;

import java.util.ArrayList;

public class CartItem {

    private ArrayList<ItemData> itemList;
    private class ItemData{

        String itemName;
        int price;
        int quantity;

        ItemData(String itemName, int price, int quantity){
            this.itemName= itemName;
            this.price= price;
            this.quantity= quantity;
        }

    }

    CartItem(){
        itemList= new ArrayList<>();
    }
    CartItem(String itemName, int price, int quantity){
        itemList= new ArrayList<>();
        ItemData item= new ItemData(itemName,price,quantity);
        itemList.add(item);
    }

    void addItem(String itemName, int price, int quantity){
        ItemData item= new ItemData(itemName,price,quantity);
        itemList.add(item);
    }
    void removeItem(String itemName){
        boolean isRemoved= itemList.removeIf(item -> item.itemName.equals(itemName));
        if(isRemoved) System.out.println("item "+itemName+" removed successfully");
        else System.out.println("no item named "+itemName+" found in the cart.");
    }
    void totalCost(){
        int total=0;
        for(int i=0;i<itemList.size();i++){
            int qty= itemList.get(i).quantity;
            int price= itemList.get(i).price;
            total+=qty*price;
        }
        System.out.println("Total Cost: "+total);
    }

}
