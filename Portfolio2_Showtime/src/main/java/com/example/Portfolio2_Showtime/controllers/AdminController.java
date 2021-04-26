package com.example.Portfolio2_Showtime.controllers;

import com.example.Portfolio2_Showtime.models.Admin;
import com.example.Portfolio2_Showtime.services.AdminServer;
import com.example.Portfolio2_Showtime.models.Item;
import com.example.Portfolio2_Showtime.services.ItemServer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@AllArgsConstructor
@RestController
public class AdminController {

    private final AdminServer adminServer;
    private final ItemServer itemServer;

    @PostMapping("/api/createItem")
    public Item createItem(@RequestBody final Item item){
        return itemServer.create(item);
    }

    @DeleteMapping("/api/deleteItem")
    public void deleteItem(@RequestBody final Long id){
        itemServer.deleteById(id);
    }

    @PostMapping("/api/login")
    public boolean logIn(@RequestBody Admin admin){
        return adminServer.logIn(admin);
    }





}
