//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.model;

public class Store {
    public Store() {
    }

    public void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            product.showDetails();

        }

    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", (double)5.0F, "Delicious chocolate", "Dark");
        products[1] = new Coke("Coke", (double)1.5F, "Refreshing soda", true);
        products[2] = new Bread("Bread", (double)2.0F, "Freshly baked bread", false);
        Store store = new Store();
        store.listProducts(products);
    }
}
