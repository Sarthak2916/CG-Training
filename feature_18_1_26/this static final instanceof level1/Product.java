package feature_18_1_26.this_static_final_instanceof_Operator_Level1;

class Product {
    static double discount = 10.0; // in %

    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount Updated to: " + discount + "%");
    }

    double calculateTotalPrice() {
        double total = price * quantity;
        double discountAmount = (discount / 100) * total;
        return total - discountAmount;
    }

    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Total Price: " + calculateTotalPrice());
        System.out.println();
    }
}

