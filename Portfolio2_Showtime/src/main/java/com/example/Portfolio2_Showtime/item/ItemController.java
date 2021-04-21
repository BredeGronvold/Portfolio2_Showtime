package com.example.Portfolio2_Showtime.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/api/items/{item_id}")
    public Item getItem(@PathVariable int item_id) {
        return itemServer.getItem(item_id);
    }

    @GetMapping("/api/item/{item_name}")
    public ArrayList<Item> getItemsByName(@PathVariable String item_name){
        return itemServer.getItemsByName(item_name);
    }

    @GetMapping("/api/item/{item_URL}")
    public Item getItemByPic(@PathVariable URL item_URL){
        return itemServer.getItemByPic(item_URL);
    }

    

}
