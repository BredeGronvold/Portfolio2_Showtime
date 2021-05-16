package com.example.Portfolio2_Showtime.controller;


import com.example.Portfolio2_Showtime.model.Item;
import com.example.Portfolio2_Showtime.service.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/api/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/api/items/{id}")
    public Optional<Item> getItem(@PathVariable Long id){
        return itemService.getItem(id);
    }

    @PostMapping("/api/items/create")
    public Item createItem(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @DeleteMapping("/api/items/delete/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }
}
