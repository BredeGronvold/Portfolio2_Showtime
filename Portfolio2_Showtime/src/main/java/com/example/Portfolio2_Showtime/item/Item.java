package com.example.Portfolio2_Showtime.item;

import java.net.URL;

public class Item {
    private int id;
    private String name;
    private double price;
    private URL picture;

    public Item(int id, String name, double price, URL picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public URL getPicture() {
        return picture;
    }

    public void setPicture(URL picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "ToSell{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", picture=" + picture +
                '}';
    }
}
