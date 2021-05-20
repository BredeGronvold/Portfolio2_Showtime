package com.example.Portfolio2_Showtime.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.logging.Logger;

@Entity
@Table(name = "items")
@NoArgsConstructor          //NoArgsConstructor, til hjelp for å lese fra databasen
@Data                       //legger inn metoder for typen
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "picture", nullable = false)
    private String pictureURL;
    @Column(name = "shortDescription", nullable = false)
    private String shortDescription;
    @Column(name = "longDescription", nullable = false)
    private String longDescription;


    public Item(String name, double price, String pictureURL, String shortDescription, String longDescription) {
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
