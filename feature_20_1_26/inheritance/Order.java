package feature_19_1_26.inheritance;

import java.time.LocalDate;

public class Order {

    int orderId;
    LocalDate date;

    Order(){}
    Order(int orderId, LocalDate date){
        this.orderId=orderId;
        this.date=date;
    }

    void getOrderStatus(){
        System.out.println("Order Placed");
    }
}

class ShippedOrder extends Order{

    String trackingNum;

    ShippedOrder(){}
    ShippedOrder(int orderId, LocalDate date,String trackingNum){
        super(orderId,date);
        this.trackingNum=trackingNum;
    }

    void getOrderStatus(){
        System.out.println("Order Shipped");
    }
}

class DeliveredOrder extends ShippedOrder{

    LocalDate deliveryDate;

    DeliveredOrder(int orderId, LocalDate date, String trackingNum, LocalDate deliveryDate){
        super(orderId,date,trackingNum);
        this.deliveryDate=deliveryDate;
    }

    void getOrderStatus(){
        System.out.println("Order Delivered");
    }
}
