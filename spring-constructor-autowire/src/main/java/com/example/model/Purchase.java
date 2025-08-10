package com.example.model;

import java.util.Date;

public class Purchase {
    private String purchaseId;
    private Date purchaseDate;
    private Product product;

    public Purchase(String purchaseId, Date purchaseDate, Product product) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.product = product;
    }

    public void displayPurchase() {
        System.out.println("Purchase ID: " + purchaseId);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("--- Product Details ---");
        if (product != null) {
            product.displayProduct();
        } else {
            System.out.println("No product available.");
        }
    }
}
