package com.example.Portfolio2_Showtime.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Order {

    private String name;
    private ArrayList<Item> items;
    private int price;
    private int orderNumber;
    private String address;
}
