package feature_1_2_26;

import java.util.*;

class ShoppingCart {

    // Stores product and price (fast access)
    private HashMap<String, Double> priceMap = new HashMap<>();

    // Maintains insertion order
    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    // Add product
    void addProduct(String product, double price) {
        priceMap.put(product, price);
        cart.put(product, price);
    }

    // Remove product
    void removeProduct(String product) {
        cart.remove(product);
        priceMap.remove(product);
    }

    // Display cart in insertion order
    void displayCart() {
        System.out.println("Cart (Insertion Order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // Display items sorted by price
    void displaySortedByPrice() {

        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nCart (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }

    // Calculate total bill
    double calculateTotal() {
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        return total;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 55000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);
        cart.addProduct("Headphones", 2000);

        cart.displayCart();

        cart.displaySortedByPrice();

        System.out.println("\nTotal Bill: " + cart.calculateTotal());
    }
}

