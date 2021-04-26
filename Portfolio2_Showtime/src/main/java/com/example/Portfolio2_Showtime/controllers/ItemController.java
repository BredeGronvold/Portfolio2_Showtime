package com.example.Portfolio2_Showtime.controllers;


import com.example.Portfolio2_Showtime.models.Item;
import com.example.Portfolio2_Showtime.services.ItemServer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
public class ItemController {

    private final ItemServer itemServer;

    @GetMapping("/api/items")
    public List<Item> getItems() {
        return itemServer.findAll();
    }

    @PostMapping("/api/items/create")
    public Item createItem(@RequestBody final Item item){
        return itemServer.create(item);
    }


}
