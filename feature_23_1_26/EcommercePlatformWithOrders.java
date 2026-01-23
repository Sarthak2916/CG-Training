package feature_23_1_26;

import java.util.ArrayList;

class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public void removeProduct(int productId) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == productId) {
                products.remove(i);
                break;
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        if (products.isEmpty()) {
            System.out.println("No products added");
        } else {
            for (Product p : products) {
                p.displayProduct();
                System.out.println("--------------------");
            }
        }
        System.out.println("Total Amount: " + calculateTotal());
        System.out.println("----------------------------------");
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private ArrayList<Order> orders;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public void viewOrders() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Orders Placed:");
        if (orders.isEmpty()) {
            System.out.println("No orders placed");
        } else {
            for (Order o : orders) {
                o.displayOrderDetails();
            }
        }
    }
}

public class EcommercePlatformWithOrders {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 55000);
        Product p2 = new Product(2, "Headphones", 2000);
        Product p3 = new Product(3, "Mouse", 800);

        Order order1 = new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(102);
        order2.addProduct(p3);

        Customer c1 = new Customer(201, "Sarthak");
        c1.placeOrder(order1);
        c1.placeOrder(order2);

        c1.viewOrders();
    }
}

