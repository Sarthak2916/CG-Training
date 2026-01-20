package feature_19_1_26.inheritance;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Author author= new Author("alnino","new york bestseller");
        author.displayInfo("Book2",2026);

        Thermostat thermostat = new Thermostat("settings1");
        thermostat.displayStatus(101,"working");

        Order o1 = new Order(101, LocalDate.now());
        System.out.println("Order ID: " + o1.orderId);
        o1.getOrderStatus();
        System.out.println();

        ShippedOrder o2 = new ShippedOrder(102, LocalDate.now(), "TRK12345");
        System.out.println("Order ID: " + o2.orderId);
        System.out.println("Tracking: " + o2.trackingNum);
        o2.getOrderStatus();
        System.out.println();

        DeliveredOrder o3 = new DeliveredOrder(103, LocalDate.now(), "TRK99999", LocalDate.now().plusDays(3));
        System.out.println("Order ID: " + o3.orderId);
        System.out.println("Tracking: " + o3.trackingNum);
        System.out.println("Delivery Date: " + o3.deliveryDate);
        o3.getOrderStatus();

        Chef chef= new Chef("Mani",101);
        System.out.println("Chef's name: "+chef.name+"\nChef's id: "+chef.id);
        chef.performDuties();

        Waiter waiter= new Waiter("Sabi",102);
        System.out.println("Waiter's name: "+waiter.name+"\nWaiter's id: "+waiter.id);
        waiter.performDuties();
    }
}
