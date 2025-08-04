package com.bharat.helloWorld.day10;

public class ItemDTO10 {

    private String name;

    private double price;


    public ItemDTO10(){

    }
    public ItemDTO10(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
