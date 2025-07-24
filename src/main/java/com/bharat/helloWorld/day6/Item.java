package com.bharat.helloWorld.day6;

public class Item {

    String name;
    double price;
    private String secretCode;//some data we dont want to send


    public Item(String name, double price, String secretCode) {
        this.name = name;
        this.price = price;
        this.secretCode = secretCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
