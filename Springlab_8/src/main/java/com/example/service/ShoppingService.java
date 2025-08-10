package com.example.service;


public class ShoppingService {

    public void addToCart(String item) {
        System.out.println("Item added to cart: " + item);
    }

    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made successfully.");
    }

    public void placeOrder() {
        System.out.println("Order has been placed.");
    }
}
