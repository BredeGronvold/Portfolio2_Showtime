package com.example.Portfolio2_Showtime.item;

import jdk.jfr.Name;

import javax.persistence.*;
import java.net.URL;

/*@Entity
@Table*/
public class Item {

    /*@Id
    @SequenceGenerator(
            name = "item_sequence",
            sequenceName = "item_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_sequence"
    )*/
    private int id;
    private String name;
    private double price;
    private URL picture;
    private String shortDescription;
    private String longDescription;

    public Item() {

    }

    public Item(int id, String name, double price, URL picture, String shortDescription, String longDescription) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.shortDescription=shortDescription;
        this.longDescription=longDescription;
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

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", picture=" + picture +
                ", longDescription='" + longDescription + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}
