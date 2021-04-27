package com.example.Portfolio2_Showtime.controller;


import com.example.Portfolio2_Showtime.item.Item;
import com.example.Portfolio2_Showtime.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class ItemController {


    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/api/items")
    public ArrayList<Item> getItems() throws SQLException {
        return itemService.getAllItems();
    }

    //Usikker hva denne skal brukes til
    @PostMapping("/api/pic/{item_id}")
    public Item setPic(@PathVariable int item_id, @RequestBody String url){
        return itemService.setPic(item_id, url);
    }

    @PreAuthorize("hasRole('Admin')")
    @PostMapping("/api/items/create")
    public Item createItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PreAuthorize("hasRole('Admin')")
    @DeleteMapping("/api/items/delete")
    public ArrayList<Item> deleteItem(@RequestBody int id){
        return itemService.deleteItem(id);
    }
}
