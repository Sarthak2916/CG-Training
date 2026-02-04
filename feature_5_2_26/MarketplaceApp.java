package feature_5_2_26;

import java.util.ArrayList;
import java.util.List;


interface Category {
    String getCategoryName();
    boolean isValidPrice(double price);
}


class BookCategory implements Category {

    public String getCategoryName() {
        return "Books";
    }

    public boolean isValidPrice(double price) {
        return price >= 100 && price <= 2000;
    }
}

class ClothingCategory implements Category {

    public String getCategoryName() {
        return "Clothing";
    }

    public boolean isValidPrice(double price) {
        return price >= 300 && price <= 5000;
    }
}

class GadgetCategory implements Category {

    public String getCategoryName() {
        return "Gadgets";
    }

    public boolean isValidPrice(double price) {
        return price >= 500 && price <= 100000;
    }
}


class Product<T extends Category> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {

        if (!category.isValidPrice(price)) {
            throw new IllegalArgumentException(
                    "Invalid price for " + category.getCategoryName()
            );
        }

        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return name + " | " +
                category.getCategoryName() +
                " | Price: " + price;
    }
}


class DiscountUtil {

    public static <T extends Product<?>>
    void applyDiscount(T product, double percentage) {

        double discountedPrice =
                product.getPrice()
                        - (product.getPrice() * percentage / 100);

        product.setPrice(discountedPrice);
    }
}



class Catalog {

    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showAllProducts() {
        for (Product<?> p : products) {
            System.out.println(p.getDetails());
        }
    }
}


public class MarketplaceApp {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Handbook", 800, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Denim Jacket", 2500, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 40000, new GadgetCategory());

        Catalog catalog = new Catalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 15);

        catalog.showAllProducts();
    }
}

