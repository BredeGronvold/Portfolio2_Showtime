package com.example.Portfolio2_Showtime.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor          //NoArgsConstructor, til hjelp for å lese fra databasen
@Data                       //legger inn metoder for typen
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String pictureURL;
    private String shortDescription;
    private String longDescription;


    public Item(String name, double price, String pictureURL, String shortDescription, String longDescription) {
        this.name = name;
        this.price = price;
        this.pictureURL = pictureURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
