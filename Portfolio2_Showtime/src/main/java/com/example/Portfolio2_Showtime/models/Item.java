package com.example.Portfolio2_Showtime.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String pictureURL;
    private String description;

    public Item(String name, double price, String pictureURL, String description) {
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
        this.description = description;
    }
}
