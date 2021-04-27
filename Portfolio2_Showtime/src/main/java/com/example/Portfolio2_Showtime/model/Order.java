package com.example.Portfolio2_Showtime.model;

import java.util.ArrayList;

public class Order {

    private String name;
    private ArrayList<Item> items;
    private int price;
    private int orderNumber;
    private String address;

    public Order(String name, ArrayList<Item> items, int price, int orderNumber, String address) {
        this.name = name;
        this.items = items;
        this.price = price;
        this.orderNumber = orderNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", items=" + items +
                ", price=" + price +
                ", orderNumber=" + orderNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
