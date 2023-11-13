package models;

import java.util.LinkedList;

public class ProductStore {
    private static LinkedList<Product> selectedProducts = new LinkedList<>();

    public static LinkedList<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public static void addSelectedProduct(Product product) {
        selectedProducts.add(product);
    }

    public static void removeSelectedProduct(Product product) {
        selectedProducts.remove(product);
    }
}

