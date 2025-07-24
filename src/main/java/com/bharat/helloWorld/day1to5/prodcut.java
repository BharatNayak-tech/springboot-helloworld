package com.bharat.helloWorld.day1to5;

public class prodcut {

    String name;

    double price;

    int quantity;

    public prodcut(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
