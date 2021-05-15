package com.example.Portfolio2_Showtime.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "items")
@NoArgsConstructor          //NoArgsConstructor, til hjelp for å lese fra databasen
@Data                       //legger inn metoder for typen
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private double price;
    @Column(name = "picture")
    private String pictureURL;
    @Column(name = "longDescription")
    private String longDescription;
    @Column(name = "shortDescription")
    private String shortDescription;


    public Item(String name, double price, String pictureURL, String shortDescription, String longDescription) {
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
