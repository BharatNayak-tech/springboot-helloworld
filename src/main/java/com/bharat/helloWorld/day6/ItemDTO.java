package com.bharat.helloWorld.day6;

public class ItemDTO {

    String name;
    double price;

    public ItemDTO(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
