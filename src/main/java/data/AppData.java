package data;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    static User user1 = new User("melat", "psdo");

    static List<User> users = new ArrayList<>();
    static Product prod1 = new Product("Product-1", "1", 1, "rings", "regular");
    static Product prod2 = new Product("Product-2", "2", 2, "pants", "regular");
    static Product prod3 = new Product("Product-3", "3", 1, "top", "cotton");
    static Product prod4 = new Product("Product-4", "4", 1, "jacket", "regular");
    static Product prod5 = new Product("Product-5", "5", 2, "skirt", "warm");
    static Product prod6 = new Product("Product-6", "7", 1, "sandal", "sparkling");
    static Product prod7 = new Product("Product-7", "8", 1, "sweaters", "summer");
    static Product prod8 = new Product("Product-8", "9", 2, "coats", "heavy");
    static Product prod9 = new Product("Product-9", "10", 1, "boots", "short");
    static Product prod10 = new Product("Product-10", "11", 1, "dress", "casual");
    static List<Product> products = new ArrayList<>();

    static {
        users.add(user1);

        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);
        products.add(prod6);
        products.add(prod7);
        products.add(prod8);
        products.add(prod9);
        products.add(prod10);

    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static Product getProducts(String id) {
        for (Product product : products) {
            if (id.equals(product.getNo())) {
                return product;
            }
        }
        return null;
    }
}