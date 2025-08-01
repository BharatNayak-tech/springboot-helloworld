package com.bharat.helloWorld.day09;

public class ItemDto09 {

    String name;

    int quantity;

    public ItemDto09(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
