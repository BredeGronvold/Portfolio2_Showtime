package com.example.Portfolio2_Showtime.item;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.ArrayList;

@RestController
public class ItemController {


    private final ItemServer itemServer;

    @Autowired
    public ItemController(ItemServer itemServer) {
        this.itemServer = itemServer;
    }

    @GetMapping("/api/items")
    public ArrayList<Item> getItems() {
        return itemServer.getAllItems();
    }

    @GetMapping("/api/itemsID/{item_id}")
    public Item getItem(@PathVariable int item_id) {
        return itemServer.getItem(item_id);
    }

    @GetMapping("/api/itemsName/{item_name}")
    public ArrayList<Item> getItemsByName(@PathVariable String item_name){
        return itemServer.getItemsByName(item_name);
    }

    @GetMapping("/api/itemsURL/{item_URL}")
    public Item getItemByPic(@PathVariable URL item_URL){
        return itemServer.getItemByPic(item_URL);
    }

    @GetMapping("/api/itemsSorted/{sortBy}")
    public ArrayList<Item> sortItems(@PathVariable String sortBy){
        return itemServer.sortedItems(sortBy);
    }
}
